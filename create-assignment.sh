#!/bin/bash

## Usage:
## `./create-assignment.sh <directory> <target> <extension> <name> <roll>`
## Example:
## `./create-assignment.sh Assignment-1/Day-1 23_Hello_world_A7 java "First Last" 114`

directory=$1
target=$2
extension=$3
name=$4
roll=$5

{
    printf "Name: %s\n" "${name}"
    printf "Roll: %s\n" "${roll}"
    printf "\n\n\n-------------------------------------------------------------------------\n\n\n"

  } >>"${target}"

count=1
for FILE in $(ls "$directory" | grep "\.${extension}$"); do
  # grouping multiple commands in a single block
  {
    printf "Code %s:\n\n" "${count}"
    cat "${directory}/${FILE}"
    printf "\n\n\n**************************************************************\n\n\n"

  } >>"${target}"
  count=$((count + 1))
done

# convert to pdf using libreoffice
libreoffice --headless --convert-to pdf "${target}"

rm "${target}"