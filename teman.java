class teman{
	private String[] nama = new String[10];
	teman(String plus){
		for(int i = 0;i < nama.length;i++){
			if(nama[i] == null){
				nama[i] = plus;
			}
		}
	}
	void show(byte a){
		System.out.println(this.nama[a]);
	}
}