package HomeworkCar;

 class Car {
     private final String id;
     public String brand;
     public String model;
     private final int year;
     private final String color;
     private final int price;

     public Car(String id, String brand, String model, int year, String color, int price) {
         this.id = id;
         this.brand = brand;
         this.model = model;
         this.year = year;
         this.color = color;
         this.price = price;
     }

     public String getBrand() {
         return brand;
     }

     public String getModel() {
         return model;
     }

     public int getYear() {
         return year;
     }

     public int getPrice() {
         return price;
     }

     @Override
     public String toString() {
         return "Car{" +
                 "id='" + id + '\'' +
                 ", brand='" + brand + '\'' +
                 ", model='" + model + '\'' +
                 ", year='" + year + '\'' +
                 ", color='" + color + '\'' +
                 ", price='" + price + '\'' +
                 '}';
     }

     public String getId() {
         return id;
     }
 }
