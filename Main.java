
public Minesweeper() {
    board = new int[SIZE][SIZE];
    revealed = new boolean[SIZE][SIZE];
    flagged = new boolean[SIZE][SIZE];
    gameOver = false;
    revealedCount = 0;
    initializeBoard();    // 布雷
    calculateNumbers();   // 计算周围雷数
}