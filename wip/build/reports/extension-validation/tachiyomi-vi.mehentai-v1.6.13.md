# Extension Validation Report

- Extension: tachiyomi-vi.mehentai-v1.6.13
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: manhwaz
- Source ID: 1503074002208879050
- Source name: MeHentai
- Source language: vi
- Selected manga input: popular offset 0: Mối Quan Hệ Không Nên Có (`.../moi-quan-he-khong-nen-co`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 6 | Mối Quan Hệ Không Nên Có (`.../moi-quan-he-khong-nen-co`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Phòng hai người (`.../phong-hai-nguoi`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Đóa Hoa Dại Của Mùa Hè Năm Ấy (Like A Wildflower In That Summer) (`.../doa-hoa-dai-cua-mua-he-nam-ay-like-a-wildflower-in-that-summer`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Mối Quan Hệ Không Nên Có (`.../moi-quan-he-khong-nen-co`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Mối Quan Hệ Không Nên Có (`.../moi-quan-he-khong-nen-co`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 38 | Chapter 1 (`.../chuong-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 31 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 6 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mối Quan Hệ Không Nên Có, URL=`.../moi-quan-he-khong-nen-co` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 47/47 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 47/47 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://api.khotruyen.site/.../content <redacted query values: expires, signature, and proxy>` (image/webp (encoding: lossy), 13104 bytes, 202x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../moi-quan-he-khong-nen-co` |  |  |  |
| details thumbnail URL | PASS | `https://api.khotruyen.site/.../content <redacted query values: expires, signature, and proxy>` |  |  |  |
| details author | PASS | STOL2 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Drama, Manga, Romance, School Life, Truyện tranh |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 38 chapters |  |  |  |
| chapter dates | PASS | 38 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 31 HTTP page URLs |  |  |  |
| duplicate page URLs | UNUSUAL | Duplicate page URLs: `https://truyen-api.360api.tech/.../content <redacted query values: expires, signature, and proxy>` at pages 2, 3, `https://truyen-api.360api.tech/.../content <redacted query values: expires, signature, and proxy>` at pages 4, 5, `https://truyen-api.360api.tech/.../content <redacted query values: expires, signature, and proxy>` at pages 6, 7, `https://truyen-api.360api.tech/.../content <redacted query values: expires, signature, and proxy>` at pages 8, 9, `https://truyen-api.360api.tech/.../content <redacted query values: expires, signature, and proxy>` at pages 10, 11, `https://truyen-api.360api.tech/.../content <redacted query values: expires, signature, and proxy>` at pages 12, 13, `https://truyen-api.360api.tech/.../content <redacted query values: expires, signature, and proxy>` at pages 14, 15, `https://truyen-api.360api.tech/.../content <redacted query values: expires, signature, and proxy>` at pages 16, 17, `https://truyen-api.360api.tech/.../content <redacted query values: expires, signature, and proxy>` at pages 18, 19, `https://truyen-api.360api.tech/.../content <redacted query values: expires, signature, and proxy>` at pages 20, 21, `https://truyen-api.360api.tech/.../content <redacted query values: expires, signature, and proxy>` at pages 22, 23, `https://truyen-api.360api.tech/.../content <redacted query values: expires, signature, and proxy>` at pages 24, 25, `https://truyen-api.360api.tech/.../content <redacted query values: expires, signature, and proxy>` at pages 26, 27, `https://truyen-api.360api.tech/.../content <redacted query values: expires, signature, and proxy>` at pages 28, 29, `https://truyen-api.360api.tech/.../content <redacted query values: expires, signature, and proxy>` at pages 30, 31 |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://truyen-api.360api.tech/.../content <redacted query values: expires, signature, and proxy>` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 523 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
