def dfiles(String dir, String filename ){
  sh """ mkdir -m 777 "${dir}" && touch "${dir}"/"$filename" """
}
