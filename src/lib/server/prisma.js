import { PrismaClient } from '@prisma/client';

const prisma = new PrismaClient();

async function getFirstBook(){
  var firstBook = await prisma.book.findFirst();
  return firstBook;
}
async function getBooks(){
  const allBooks = await prisma.book.findMany({
    where: {
      Author: {
        contains: 'Yahtzee',
    }
  }
  })
  console.log(allBooks)
}
getBooks()