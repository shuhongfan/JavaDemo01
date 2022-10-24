package com.shf.demo.Search;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 分块查找
 */
public class BlockSearchDemo {
    public static void main(String[] args) {
        int[] arr = {
                16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};

        Block block1 = new Block(21, 0, 5);
        Block block2 = new Block(45, 6, 11);
        Block block3 = new Block(73, 12, 17);

        Block[] blockArr = {block1, block2, block3};

        int number = 37;

        int index = getIndex(blockArr, arr, number);
        System.out.println(index);
    }

    private static int getIndex(Block[] blockArr, int[] arr, int number) {
        int indexBlock = findIndexBlock(blockArr, number);

        if (indexBlock == -1) {
            return -1;
        }

        int startIndex = blockArr[indexBlock].getStartIndex();
        int endIndex = blockArr[indexBlock].getEndIndex();

        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static int findIndexBlock(Block[] blockArr, int number) {
        for (int i = 0; i < blockArr.length; i++) {
            if (number <= blockArr[i].getMax()) {
                return i;
            }
        }
        return -1;
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Block {
    private int max;  // 当前块最大值
    private int startIndex; //起始index
    private int endIndex; // 结束index
}
