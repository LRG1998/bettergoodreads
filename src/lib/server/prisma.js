import { PrismaClient } from '@prisma/client';

const prisma = new PrismaClient();

async function createNewBook(title, author, published) {
  const result = await prisma.book.create({
    data: {
      title,
      author,
      published,
    },
  });
  return result;
}

export { prisma, createNewBook };