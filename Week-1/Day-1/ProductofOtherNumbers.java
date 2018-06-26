class ProductofOtherNumbers 
{
	
	void product(int a[], int n) 
	{
		
		int l[] = new int[n];
		int r[] = new int[n];
		int p[] = new int[n];

		int i, j;
		l[0] = 1;
		r[n - 1] = 1;
		for (i = 1; i < n; i++)
			l[i] = a[i - 1] * l[i - 1];
		
		for (j = n - 2; j >= 0; j--)
			r[j] = a[j + 1] * r[j + 1];
		
		for (i = 0; i < n; i++)
			p[i] = l[i] * r[i];
		
		for (i = 0; i < n; i++)
			System.out.print(p[i] + " ");

		return;
	}

	
	public static void main(String[] args) 
	{
		ProductofOtherNumbers p = new ProductofOtherNumbers();
		int a[] = {10, 3, 5, 6, 2};
		int n = a.length;
		p.product(a, n);
	}
}


