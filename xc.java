private void display() {
        // 打印列号
        System.out.println("  | 0 1 2 3 4 5 6 7 8 9");
        System.out.println("--+---------------------");
        for (int i = 0; i < SIZE; i++) {
            // 打印行号
            System.out.print(i + " | ");
            for (int j = 0; j < SIZE; j++) {
                if (revealed[i][j]) {
                    if (board[i][j] == -1) {
                        System.out.print("* "); // 雷
                    } else if (board[i][j] == 0) {
                        System.out.print("  "); // 无数字
                    } else {
                        System.out.print(board[i][j] + " "); // 数字
                    }
                } else if (flagged[i][j]) {
                    System.out.print("F "); // 旗子
                } else {
                    System.out.print(". "); // 未翻开
                }
            }
            System.out.println();
        }
    }
