 
 p u b l i c   c l a s s   P r o d u c t   i m p l e m e n t s   C o m p a r a b l e < P r o d u c t >   {  
 	 p r i v a t e   S t r i n g   i t e m ;  
 	 p r i v a t e   d o u b l e   p r i c e ;  
 	 p r i v a t e   d o u b l e   q u a n t i t y ;  
 	  
 	 p u b l i c   P r o d u c t ( d o u b l e   p r i c e ,   S t r i n g   i t e m )   {  
 	 	 t h i s . p r i c e   =   p r i c e ;  
 	 	 t h i s . i t e m   =   i t e m ;  
 	 }  
 	  
 	 p u b l i c   P r o d u c t ( S t r i n g   o r d e r I t e m ,   d o u b l e   o r d e r Q u a n t i t y )   {  
 	 	 t h i s . i t e m   =   o r d e r I t e m ;  
 	 	 t h i s . q u a n t i t y   =   o r d e r Q u a n t i t y ;  
 	 }  
 	  
 	 p u b l i c   S t r i n g   g e t I t e m ( )   {  
 	 	 r e t u r n   i t e m ;  
 	 }  
 	 p u b l i c   v o i d   s e t I t e m ( S t r i n g   i t e m )   {  
 	 	 t h i s . i t e m   =   i t e m ;  
 	 }  
 	  
 	 p u b l i c   d o u b l e   g e t P r i c e ( )   {  
 	 	 r e t u r n   p r i c e ;  
 	 }  
 	 p u b l i c   v o i d   s e t P r i c e ( d o u b l e   p r i c e )   {  
 	 	 t h i s . p r i c e   =   p r i c e ;  
 	 }  
  
 	 p u b l i c   d o u b l e   g e t Q u a n t i t y ( )   {  
 	 	 r e t u r n   q u a n t i t y ;  
 	 }  
 	 p u b l i c   v o i d   s e t Q u a n t i t y ( d o u b l e   q u a n t i t y )   {  
 	 	 t h i s . q u a n t i t y   =   q u a n t i t y ;  
 	 }  
 	  
 	 @ O v e r r i d e  
 	 p u b l i c   i n t   c o m p a r e T o ( P r o d u c t   p )   {  
 	 	 r e t u r n   D o u b l e . c o m p a r e ( t h i s . p r i c e ,   p . p r i c e ) ;  
 	 }  
  
 	 @ O v e r r i d e  
 	 p u b l i c   S t r i n g   t o S t r i n g ( )   {  
 	 	 r e t u r n   t h i s . p r i c e   +   "   "   +   t h i s . i t e m ;  
 	 }  
 	  
 	  
 }  
 