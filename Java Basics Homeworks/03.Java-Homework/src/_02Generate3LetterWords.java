i m p o r t   j a v a . u t i l . S c a n n e r ;  
  
  
 p u b l i c   c l a s s   _ 0 2 G e n e r a t e 3 L e t t e r W o r d s   {  
  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	 S c a n n e r   i n p u t   =   n e w   S c a n n e r ( S y s t e m . i n ) ;  
 	 	 S t r i n g   l e t t e r s S t r i n g   =   i n p u t . n e x t L i n e ( ) ;  
 	 	 S t r i n g [ ]   l e t t e r s A r r   =   n e w   S t r i n g [ l e t t e r s S t r i n g . l e n g t h ( ) ] ;  
 	 	  
 	 	 f o r   ( i n t   i   =   0 ;   i   <   l e t t e r s A r r . l e n g t h ;   i + + )   {  
 	 	 	 l e t t e r s A r r [ i ]   =   C h a r a c t e r . t o S t r i n g ( l e t t e r s S t r i n g . c h a r A t ( i ) ) ;    
 	 	 }  
 	 	  
 	 	 f o r   ( i n t   i   =   0 ;   i   <   l e t t e r s A r r . l e n g t h ;   i + + )   {  
 	 	 	 f o r   ( i n t   i 1   =   0 ;   i 1   <   l e t t e r s A r r . l e n g t h ;   i 1 + + )   {  
 	 	 	 	 f o r   ( i n t   i 2   =   0 ;   i 2   <   l e t t e r s A r r . l e n g t h ;   i 2 + + )   {  
 	 	 	 	 	 S y s t e m . o u t . p r i n t ( l e t t e r s A r r [ i ]   +   l e t t e r s A r r [ i 1 ]   +   l e t t e r s A r r [ i 2 ]   +   "   " ) ;  
 	 	 	 	 }  
 	 	 	 }  
 	 	 }  
 	 	  
 	 }  
  
 }  
 