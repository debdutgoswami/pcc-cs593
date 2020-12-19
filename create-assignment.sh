#!/bin/bash

## Usage:
## `./create-assignment.sh <directory> <target>`
## Example:
## `./create-assignment.sh Assignment-1/Day-1 23_Hello_world_A7`

directory=$1
target=$2
extension=$3

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