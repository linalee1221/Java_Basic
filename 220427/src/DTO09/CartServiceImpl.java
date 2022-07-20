package DTO09;

public class CartServiceImpl implements CartService {

	@Override
	public void addCart(String cartItemDto, String email) {
		System.out.println("장바구니 넣기");
	}

	@Override
	public void getCartList(String email) {
		System.out.println("장바구니 목록 가져오기");
		
	}

	@Override
	public void validateCartItem(Long cartItemId, String email) {
		System.out.println("장바구니 아이템 유효성 체크");
	}

	@Override
	public void updateCartItemCount(Long cartItemId, int count) {
		System.out.println("장바구니 개수 업데이트");
	}

	@Override
	public void deleteCartItem(Long cartItemId) {
		System.out.println("장바구니 개수 삭제");
	}

	@Override
	public void orderCartItem(String cartOrderDtoList, String email) {
		System.out.println("장바구니 주문");
	}
	
	

}
