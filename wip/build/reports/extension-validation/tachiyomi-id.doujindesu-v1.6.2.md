# Extension Validation Report

- Extension: tachiyomi-id.doujindesu-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7704282043609669342
- Source name: Doujindesu
- Source language: id
- Selected manga input: popular offset 0: A Wonderful New World (`.../a-wonderful-new-world`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | A Wonderful New World (`.../a-wonderful-new-world`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Boku no Kaa-san de, Boku no Suki na Hito. (`.../boku-no-kaa-san-de-boku-no-suki-na-hito`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | TS Punishment (`.../ts-punishment`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Cleaning Service (`.../cleaning-service`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | A Wonderful New World (`.../a-wonderful-new-world`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A Wonderful New World (`.../a-wonderful-new-world`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 275 | Chapter 1 (`.../e57ee0a4-96d1-4b54-baf4-888ce6bdeee1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 23 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Wonderful New World, URL=`.../a-wonderful-new-world` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-static.desu.xxx/.../5839%3D.jpg` (image/jpeg, 34169 bytes, 300x420) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../a-wonderful-new-world` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-static.desu.xxx/.../5839%3D.jpg` |  |  |  |
| details author | PASS | Gonjison, Ko Sonjak |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Big Ass, Big Breast, Blackmail, Blowjob, Business Suit, Cheating, Filming, Full Color, Glasses, Group, Harem, Milf, Pantyhose, Stocking, Story Arc, Webtoon |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **Sinopsis:**<br>Ho-Seung adalah seorang pekerja kantoran yang tidak populer, ia bekerja untuk salah satu perusahaan terbesar di Korea. Suatu hari ia dituduh memasang kamera di toilet wanita. Namun pada akhirnya, dia terbukti tidak bersalah. Kemudian suatu hari, dia tiba-tiba diberitahu tentang penugasannya kembali oleh manajer tim. Tampaknya dia menang, sampai akhirnya ia…..<br><br>**Seri:** Manhwa<br>**Judul Alternatif:** 멋진 신세계, Brave New World, Amazing New World, Beautiful New World |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 275 chapters |  |  |  |
| chapter dates | PASS | 275 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | `https://images2.imgbox.com/.../gxCBKwo1_o.jpg` (image/jpeg, 8091 bytes, 240x240); known placeholder: imgbox: Thumbnail Temporarily Unavailable | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
