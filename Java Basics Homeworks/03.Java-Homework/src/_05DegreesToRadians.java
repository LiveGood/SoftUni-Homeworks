i m p o r t   j a v a . u t i l . S c a n n e r ;  
  
  
 p u b l i c   c l a s s   _ 0 5 D e g r e e s T o R a d i a n s   {  
  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 / / 	 	 d o u b l e   d e g r e e s   =   1 2 0 ;  
 / / 	 	 d o u b l e   r a d i a n s   =   d e g r e e s   *   ( M a t h . P I     /   1 8 0 ) ;  
 / / 	 	 d e g r e e s   =   r a d i a n s   *   ( 1 8 0   /   M a t h . P I ) ;  
 	 	 S c a n n e r   i n p u t   =   n e w   S c a n n e r ( S y s t e m . i n ) ;  
 	 	 i n t   n u m b e r s L e n g h t   =   I n t e g e r . p a r s e I n t ( i n p u t . n e x t L i n e ( ) ) ;  
 	 	 d o u b l e [ ]   r e s u l t s   =   n e w   d o u b l e [ n u m b e r s L e n g h t ] ; 	  
 	 	  
 	 	 f o r   ( i n t   i   =   0 ;   i   <   n u m b e r s L e n g h t ;   i + + )   {  
 	 	 	 S t r i n g   i n p u t N u m b e r   =   i n p u t . n e x t L i n e ( ) ;  
 	 	 	 S t r i n g [ ]   n u m A n d M e a s u r e   =   i n p u t N u m b e r . s p l i t ( "   " ) ;  
 	 	 	  
 	 	 	 d o u b l e   v a l u e   =   D o u b l e . p a r s e D o u b l e ( n u m A n d M e a s u r e [ 0 ] ) ;  
 	 	 	 S t r i n g   d e g O r R a d   =   n u m A n d M e a s u r e [ 1 ] ;  
 	 	 	  
 	 	 	 r e s u l t s [ i ]   =   C o n v e r A n g l e U n i t s ( v a l u e ,   d e g O r R a d ) ;  
 	 	 }  
 	 	  
 	 	 f o r   ( d o u b l e   d   :   r e s u l t s )   {  
 	 	 	 S y s t e m . o u t . p r i n t f ( " % . 6 f " ,   d ) ;  
 	 	 	 S y s t e m . o u t . p r i n t l n ( ) ;  
 	 	 }  
 	 	  
  
 	 }  
  
 	 p r i v a t e   s t a t i c   d o u b l e   C o n v e r A n g l e U n i t s ( d o u b l e   v a l u e ,   S t r i n g   d e g O r R a d )   {  
 	 	  
 	 	 d o u b l e   r e s u l t   =   0 ;  
 	 	  
 	 	 i f   ( d e g O r R a d . e q u a l s ( " d e g " ) )   {  
 	 	 	 r e s u l t   =   v a l u e   *   ( M a t h . P I   /   1 8 0 ) ;  
 	 	 }  
 	 	 e l s e   i f   ( d e g O r R a d . e q u a l s ( " r a d " ) )   {  
 	 	 	 r e s u l t   =   v a l u e   *   ( 1 8 0   /   M a t h . P I ) ;  
 	 	 }  
 	 	  
 	 	 r e t u r n   r e s u l t ;  
 	 	  
 	 	  
 	 }  
  
 }  
 