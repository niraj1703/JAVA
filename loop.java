public class loop {
    
    public static void main(String[] args) {
        
        // for (int i = 0; i < 5; i++) {
        //     System.out.println(i);
        // }

        // for (int i = 0; i <= 10; i = i + 2) {
        //     System.out.println(i);
        //   }  

        //   for (int i = 1; i <= 2; i++) {
        //     System.out.println("Outer: " + i); // Executes 2 times
            
        //     // Inner loop
        //     for (int j = 1; j <= 3; j++) {
        //       System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
        //     }
        //   } 


//           String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
// for (String i : cars) {
//   System.out.println(i);
// }


int number = 2;

// Print the multiplication table for the number 2
for (int i = 1; i <= 10; i++) {
  System.out.println(number + " x " + i + " = " + (number * i));
} 


for (int i = 0; i < 10; i++) {
    if (i == 4) {
      break;
    }
    System.out.println(i);
  }


  for (int i = 0; i < 10; i++) {
    if (i == 4) {
      continue;
    }
    System.out.println(i);
  }


//   int i = 0;
//   while (i < 10) {
//     System.out.println(i);
//     i++;
//     if (i == 4) {
//       break;
//     }
//   }


//   int i = 0;
// while (i < 10) {
//   if (i == 4) {
//     i++;
//     continue;
//   }
//   System.out.println(i);
//   i++;
// }






    }
}
