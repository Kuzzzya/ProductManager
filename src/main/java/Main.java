//  Manager man = new Manager();
//  вычитаем из массива
//        String[] names = {
//                "Petya",
//                "Anya",
//                "Olya",
//                "Kolya",
//                "Sveta"
//        };
//        String removeName = "Olya";
//        String[] tmp = new String[names.length - 1];
//        int copyToIndex = 0;
//        for (int i = 0; i < names.length; i++) {
//            if (!names[i].equals(removeName)) {
//                tmp[copyToIndex] = names[i];
//                copyToIndex++;
//            }
//        }
//        names = tmp;
//    }
//}
//        дай размер прошлого массива и увеличь его число на единицу
//        /*String[] tmp = new String[names.length + 1];
//        скоростной набор, чтобы перебрать массив name.fori

//        for (int i = 0; i < names.length; i++) {
////            мне надо скопировать в tmp то, что лежит в names.
//            tmp[i] = names[i];
//        }
////        Последним массивом поставить newName
//        tmp[tmp.length - 1] = newName;
//        names = tmp;


//String[] names = new String[5];

//Массив names состоящий из 5 ячеек

//    строй комплект

//        PurchaseItem first = new PurchaseItem(1111, 1, "first", 100, 2);
//        PurchaseItem second = new PurchaseItem(22, 2, "second", 10, 1);
//        PurchaseItem third = new PurchaseItem(333, 3, "third", 1, 2);
//
//        CartRepository repo = new CartRepository();
//        repo.save(first);
//        repo.save(second);
//        repo.save(third);
//        repo.removeById(22);
//        PurchaseItem[] expected = {first, second, third};
//        PurchaseItem[] actual = repo.findAll();
//        assertEquals(expected, actual);
//
//
//
//        String[] names = {
//                "Petya",
//                "Anya",
//                "Olya",
//                "Kolya",
//                "Sveta"
//        };
//
//
//        String removeName = "Olya";
//        String[] tmp = new String[names.length - 1];
//        int copyToIndex = 0;
//        for (int i = 0; i < names.length; i++) {
//            if (!names[i].equals(removeName)) {
//                tmp[copyToIndex] = names[i];
//                copyToIndex++;
//            }
//        }
//        names = tmp;
//    }
//}


//        String[] names = {
//                "Petya",
//                "Anya",
//                "Olya"
//
//        };
//        String newName = "Kolya";
//
//        String[] tmp = new String[names.length + 1];
//        for (int i = 0; i < names.length; i++) {
//            tmp[i] = names[i];
//        }
//        tmp[tmp.length - 1] = newName;
//        names = tmp;

//        String[] names = new String[5];
