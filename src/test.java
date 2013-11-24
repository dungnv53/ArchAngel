import java.io.*;
import java.text.NumberFormat;

public class ReadBinaryFile
{

  public static void main(String[] args)
  {
  NumberFormat
  DataInputStream in = getStream(“movies.dat”);
  boolean eof = false;
  while (!eof)
  {
    Movie movie = readMovie(in);
    if (movie == null)
        continued
        public class ReadBinaryFile

