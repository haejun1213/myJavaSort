package mysort.sort;

public class BubbleSort extends Sort {

	@Override
	public void sort(int[] dataList) {
		// 파라미터로 받은 데이터 set
		setData(dataList);

		// 구간 내의 최댓값을 배열의 가장 오른쪽으로 스왑(스왑 후 가장 오른쪽 인덱스--)
		for (int last = sortedData.length - 1; last >= 1; last--) { //마지막 인덱스부터 정렬된 오른쪽 끝 제외
			for (int i = 0; i <= last - 1; i++) { // 인덱스 0 부터 last 반복하면서 
				if (sortedData[i] > sortedData[i + 1]) // 오른쪽 값보다 왼쪽값이 더 크면
					swap(sortedData, i, i + 1); // 그 비교한 값을 스왑
			}
		}
	}

}
