i m p o r t   j a v a . u t i l . H a s h S e t ;  
 i m p o r t   j a v a . u t i l . S e t ;  
  
  
 p u b l i c   c l a s s   _ 0 3 F u l l H o u s e   {  
  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	  
 	 	 c h a r [ ]   s u i t s   =   { ' \ u 2 6 6 0 ' , ' \ u 2 6 6 5 ' , ' \ u 2 6 6 6 ' , ' \ u 2 6 6 3 ' } ;  
 	 	 c h a r [ ]   c a r d s   =   { ' 2 ' , ' 3 ' , ' 4 ' , ' 5 ' , ' 6 ' , ' 7 ' , ' 8 ' , ' 9 ' , ' T ' , ' J ' , ' Q ' , ' K ' , ' A ' , } ;  
 	 	 S t r i n g [ ]   a l l C a r d s =   n e w   S t r i n g [ 5 2 ] ;  
 	 	  
 	 	 / / a d d   a l l   c a r d s   i n   a r r a y  
 	 	 i n t   i n d e x C o u n t e r   =   0 ;  
 	 	 f o r   ( i n t   i   =   0 ;   i   <   c a r d s . l e n g t h ;   i + + )   {  
 	 	 	 f o r   ( i n t   j   =   0 ;   j   <   s u i t s . l e n g t h ;   j + + )   {  
 	 	 	 	 a l l C a r d s [ i n d e x C o u n t e r ]   =   C h a r a c t e r . t o S t r i n g ( c a r d s [ i ] )   +   C h a r a c t e r . t o S t r i n g ( s u i t s [ j ] ) ;  
 	 	 	 	 i n d e x C o u n t e r + + ;  
 	 	 	 }  
 	 	 }  
 	 	  
 	 	 i n t   f u l l H o u s e C o u n t e r   =   0 ;  
 	 	 f o r   ( i n t   i 1   =   0 ;   i 1   <   4 8 ;   i 1 + + )  
 	 	 	 f o r   ( i n t   i 2   =   i 1   +   1 ;   i 2   <   4 9 ;   i 2 + + )  
 	 	 	 	 f o r   ( i n t   i 3   =   i 2   +   1 ;   i 3   <   5 0 ;   i 3 + + )  
 	 	 	 	 	 f o r   ( i n t   i 4   =   i 3   +   1 ;   i 4   <   5 1 ;   i 4 + + )  
 	 	 	 	 	 	 f o r   ( i n t   i 5   =   i 4   +   1 ;   i 5   <   5 2 ;   i 5 + + )   {  
 	 	 	 	 	 	 	 c h a r [ ]   h a n d s C a r d s A r r   =   {  
 	 	 	 	 	 	 	 	 	 a l l C a r d s [ i 1 ] . c h a r A t ( 0 ) ,  
 	 	 	 	 	 	 	 	 	 a l l C a r d s [ i 2 ] . c h a r A t ( 0 ) , 	 	 	 	 	 	 	 	 	  
 	 	 	 	 	 	 	 	 	 a l l C a r d s [ i 3 ] . c h a r A t ( 0 ) , 	 	 	 	 	 	 	 	 	  
 	 	 	 	 	 	 	 	 	 a l l C a r d s [ i 4 ] . c h a r A t ( 0 ) , 	 	 	 	 	 	 	 	 	  
 	 	 	 	 	 	 	 	 	 a l l C a r d s [ i 5 ] . c h a r A t ( 0 ) 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	  
 	 	 	 	 	 	 	 } ;  
 	 	 	 	 	 	 	  
 	 	 	 	 	 	 	 / /     t h e   H a s h S e t   c o u n t s   d i s t i n c t   v a l u e s  
 	 	 	 	 	 	 	 / /     t h e   l o g i c   i s   t h a t   a l l   f u l l   h o u s e s   h a v e   o n l y   2   d i f f e r e n t   c a r d   v a l u e s  
 	 	 	 	 	 	 	 S e t < C h a r a c t e r >   f u l l H o u s e S e t     =   n e w   H a s h S e t < > ( ) ;  
 	 	 	 	 	 	 	 f o r   ( c h a r   c   :   h a n d s C a r d s A r r )   {  
 	 	 	 	 	 	 	 	 f u l l H o u s e S e t . a d d ( c ) ;  
 	 	 	 	 	 	 	 }  
 	 	 	 	 	 	 	  
 	 	 	 	 	 	 	 i f   ( f u l l H o u s e S e t . s i z e ( )   = =   2 )   {  
 	 	 	 	 	 	 	 	  
 	 	 	 	 	 	 	 	 / /   f o u r   o f   a   k i n d   h a n d s   h a v e   2   d i s t i n c t   c a r d s   a s   w e l l   s o  
 	 	 	 	 	 	 	 	 / /   w e   c h e c k   i f   t h e   h a n d   i s   f o u r   o f   a   k i n d  
 	 	 	 	 	 	 	 	 c h a r   f i r s t C h a r   =   h a n d s C a r d s A r r [ 0 ] ;  
 	 	 	 	 	 	 	 	 c h a r   l a s t C h a r   =   h a n d s C a r d s A r r [ 4 ] ;  
 	 	 	 	 	 	 	 	 i n t   d i f f C o u n t e r 1   =   0 ;  
 	 	 	 	 	 	 	 	 i n t   d i f f C o u n t e r 2   =   0 ;  
 	 	 	 	 	 	 	 	  
 	 	 	 	 	 	 	 	 f o r   ( i n t   i   =   0 ;   i   <   h a n d s C a r d s A r r . l e n g t h ;   i + + )   {  
 	 	 	 	 	 	 	 	 	   i f ( h a n d s C a r d s A r r [ i ]   = =   f i r s t C h a r )   {  
 	 	 	 	 	 	 	 	 	 	   d i f f C o u n t e r 1 + + ;  
 	 	 	 	 	 	 	 	 	   }  
 	 	 	 	 	 	 	 	 	   e l s e   i f   ( h a n d s C a r d s A r r [ i ]   = =   l a s t C h a r )   {  
 	 	 	 	 	 	 	 	 	 	   d i f f C o u n t e r 2 + + ;  
 	 	 	 	 	 	 	 	 	   }  
 	 	 	 	 	 	 	 	 }  
 	 	 	 	 	 	 	 	 b o o l e a n   n o t F o u r O f A k i n d   =   d i f f C o u n t e r 1   ! =   4   & &   d i f f C o u n t e r 2   ! = 4 ;  
 	 	 	 	 	 	 	 	  
 	 	 	 	 	 	 	 	 i f   ( n o t F o u r O f A k i n d )   {  
 	 	 	 	 	 	 	 	 	 S y s t e m . o u t . p r i n t l n ( a l l C a r d s [ i 1 ]   +   a l l C a r d s [ i 2 ]   +    
 	 	 	 	 	 	 	 	 	 	 	 a l l C a r d s [ i 3 ]   +   a l l C a r d s [ i 4 ]   +   a l l C a r d s [ i 5 ] ) ;  
 	 	 	 	 	 	 	 	 	 f u l l H o u s e C o u n t e r + + ;  
 	 	 	 	 	 	 	 	 }  
 	 	 	 	 	 	 	  
 	 	 	 	 	 	 	 }  
 	 	 	 	 	 	 }  
 	 	 S y s t e m . o u t . p r i n t l n ( f u l l H o u s e C o u n t e r ) ;  
 	 }  
  
 }  
 