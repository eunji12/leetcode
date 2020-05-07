package me.home.arrays;
public class DVD {
  public String name;
  public int release;
  public String director;

  public DVD(String name, int release, String director){
    this.name = name;
    this.release = release;
    this.director = director;
  }
  @Override
  public String toString() {
    return "DVD{" +
        "name='" + name + '\'' +
        ", release=" + release +
        ", director='" + director + '\'' +
        '}';
  }
}