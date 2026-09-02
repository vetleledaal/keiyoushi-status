# Extension Validation Report

- Extension: tachiyomi-id.narasininja-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 30
- Lint: 0
- Warnings: 2
- Skipped: 2
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4748581925941451102
- Source name: NarasiNinja
- Source language: id
- Selected manga input: popular offset 0: What Was Meant to Be a Contract Marriage Turned Into the Duke’s Obsession (`.../what-was-meant-to-be-a-contract-marriage-turned-into-the-dukes-obsession`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | What Was Meant to Be a Contract Marriage Turned Into the Duke’s Obsession (`.../what-was-meant-to-be-a-contract-marriage-turned-into-the-dukes-obsession`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | What Was Meant to Be a Contract Marriage Turned Into the Duke’s Obsession (`.../what-was-meant-to-be-a-contract-marriage-turned-into-the-dukes-obsession`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Shujinkou no Osananajimi ga, Wakiyaku no Ore ni Gui Gui Kuru (`.../shujinkou-no-osananajimi-ga-wakiyaku-no-ore-ni-gui-gui-kuru`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | What Was Meant to Be a Contract Marriage Turned Into the Duke’s Obsession (`.../what-was-meant-to-be-a-contract-marriage-turned-into-the-dukes-obsession`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | What Was Meant to Be a Contract Marriage Turned Into the Duke’s Obsession (`.../what-was-meant-to-be-a-contract-marriage-turned-into-the-dukes-obsession`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 20 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 40 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=What Was Meant to Be a Contract Marriage Turned Into the Duke’s Obsession, URL=`.../what-was-meant-to-be-a-contract-marriage-turned-into-the-dukes-obsession` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 10 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | FAIL | Invalid manga: popular entry 3: title=<blank>, URL=`.../chapter-20`, popular entry 4: title=<blank>, URL=`.../chapter-19`, popular entry 5: title=<blank>, URL=`.../chapter-12`, popular entry 8: title=<blank>, URL=`.../chapter-3.1`, popular entry 9: title=<blank>, URL=`.../chapter-2.2`, popular entry 10: title=<blank>, URL=`.../chapter-2.1`, popular entry 13: title=<blank>, URL=`.../chapter-17`, popular entry 14: title=<blank>, URL=`.../chapter-16`, popular entry 15: title=<blank>, URL=`.../chapter-15`, popular entry 18: title=<blank>, URL=`.../chapter-51`, popular entry 19: title=<blank>, URL=`.../chapter-50`, popular entry 20: title=<blank>, URL=`.../chapter-49`, popular entry 23: title=<blank>, URL=`.../chapter-67`, popular entry 24: title=<blank>, URL=`.../chapter-66`, popular entry 25: title=<blank>, URL=`.../chapter-65`, popular entry 28: title=<blank>, URL=`.../chapter-87`, popular entry 29: title=<blank>, URL=`.../chapter-84`, popular entry 30: title=<blank>, URL=`.../chapter-81`, popular entry 33: title=<blank>, URL=`.../chapter-125`, popular entry 34: title=<blank>, URL=`.../chapter-122`, popular entry 35: title=<blank>, URL=`.../chapter-121`, popular entry 38: title=<blank>, URL=`.../chapter-298`, popular entry 39: title=<blank>, URL=`.../chapter-295`, popular entry 40: title=<blank>, URL=`.../chapter-294`, popular entry 43: title=<blank>, URL=`.../chapter-25`, popular entry 44: title=<blank>, URL=`.../chapter-24`, popular entry 45: title=<blank>, URL=`.../chapter-23`, popular entry 48: title=<blank>, URL=`.../chapter-49`, popular entry 49: title=<blank>, URL=`.../chapter-38`, popular entry 50: title=<blank>, URL=`.../chapter-31` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| thumbnail URLs | UNUSUAL | 51/91 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://narasininja.net/.../what-was-meant-to-be-a-contract-marriage-turned-into-the-dukes-obsession.jpg` (image/jpeg, 127507 bytes, 493x697) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../what-was-meant-to-be-a-contract-marriage-turned-into-the-dukes-obsession` |  |  |  |
| details thumbnail URL | PASS | `https://narasininja.net/.../what-was-meant-to-be-a-contract-marriage-turned-into-the-dukes-obsession.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Fantasy, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Setelah kehilangan orang tuanya bertahun-tahun yang lalu, putri Marquis, Rashel, mendedikasikan seluruh hidupnya untuk melindungi adik laki-lakinya yang menderita penyakit mematikan. Namun semuanya hancur ketika ia menemukan kebenaran yang mengerikan: tunangannya, Alois, berencana membunuh adiknya untuk merebut warisan keluarga—dan untuk menjaga rahasia itu tetap terkubur, ia juga membunuh Rashel. Namun takdir memberinya kesempatan kedua. Terlempar kembali ke masa lalu sebelum tragedi itu terjadi, Rashel bersumpah akan mengubah takdir mereka dan menyelamatkan keluarganya dengan segala cara. Untuk melakukan itu, ia meminta bantuan kepada satu-satunya pria yang ditakuti di seluruh kerajaan karena reputasinya yang kejam: Duke Ghislain Hubert. "Kumohon… nikahi aku." Apa yang dimulai sebagai pernikahan yang dingin dan didasarkan pada kepentingan bersama perlahan mulai berkembang menjadi sesuatu yang tidak mereka duga. Meskipun Ghislain tampak dingin dan tanpa emosi pada awalnya, sedikit demi sedikit, Rashel mulai menembus dinding di sekitar hatinya. Namun di dunia yang penuh dengan intrik, pengkhianatan, dan bahaya, dapatkah pernikahan kontrak mereka benar-benar menjadi cinta sejati? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 20 chapters |  |  |  |
| chapter dates | PASS | 20 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | UNUSUAL | Duplicate page URLs: `https://yuucdn.com/.../1.webp` at pages 1, 21, `https://yuucdn.com/.../2.webp` at pages 2, 22, `https://yuucdn.com/.../3.webp` at pages 3, 23, `https://yuucdn.com/.../4.webp` at pages 4, 24, `https://yuucdn.com/.../5.webp` at pages 5, 25, `https://yuucdn.com/.../6.webp` at pages 6, 26, `https://yuucdn.com/.../7.webp` at pages 7, 27, `https://yuucdn.com/.../8.webp` at pages 8, 28, `https://yuucdn.com/.../9.webp` at pages 9, 29, `https://yuucdn.com/.../10.webp` at pages 10, 30, `https://yuucdn.com/.../11.webp` at pages 11, 31, `https://yuucdn.com/.../12.webp` at pages 12, 32, `https://yuucdn.com/.../13.webp` at pages 13, 33, `https://yuucdn.com/.../14.webp` at pages 14, 34, `https://yuucdn.com/.../15.webp` at pages 15, 35, `https://yuucdn.com/.../16.webp` at pages 16, 36, `https://yuucdn.com/.../17.webp` at pages 17, 37, `https://yuucdn.com/.../18.webp` at pages 18, 38, `https://yuucdn.com/.../19.webp` at pages 19, 39, `https://yuucdn.com/.../20.webp` at pages 20, 40 |  |  |  |
| page load | PASS | `https://yuucdn.com/.../1.webp` (image/webp (encoding: lossy), 223390 bytes, 728x7280) |  |  |  |
