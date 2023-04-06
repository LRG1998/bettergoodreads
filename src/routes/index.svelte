import { createNewBook } from './prisma';

// Insert a new book with hard-coded values
createNewBook('The Great Gatsby', 'F. Scott Fitzgerald', new Date('1925-04-10'));

// Insert another book
createNewBook('To Kill a Mockingbird', 'Harper Lee', new Date('1960-07-11'));