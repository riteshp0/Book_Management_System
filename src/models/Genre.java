package models;

public class Genre {

   public String name;

   String description;

   String genre;

   public String getname() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public Genre(String name, String description) {
      this.name = name;
      this.description = description;



   }
}
