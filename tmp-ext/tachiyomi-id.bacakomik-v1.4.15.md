# Extension Validation Report

- Extension: tachiyomi-id.bacakomik-v1.4.15
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4383360263234319058
- Source name: BacaKomik
- Source language: id
- Selected manga input: latest offset 0: Genius Grandson of the Loan Shark King (`.../genius-grandson-of-the-loan-shark-king`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Solo Leveling (`.../solo-leveling`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Return of The Greatest Lancer (`.../191268-return-of-the-greatest-lancer`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Genius Grandson of the Loan Shark King (`.../genius-grandson-of-the-loan-shark-king`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | The Bully In Charge (`.../the-bully-in-charge`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Genius Grandson of the Loan Shark King (`.../genius-grandson-of-the-loan-shark-king`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Genius Grandson of the Loan Shark King (`.../genius-grandson-of-the-loan-shark-king`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 119 | Chapter 1 (`.../genius-grandson-of-the-loan-shark-king-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 41 |  |  | <1s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Genius Grandson of the Loan Shark King, URL=`.../genius-grandson-of-the-loan-shark-king` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.wp.com/.../Komik-Genius-Grandson-of-the-Loan-Shark-King.jpg <redacted query values: resize>` (image/jpeg, 9348 bytes, 146x208) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../genius-grandson-of-the-loan-shark-king` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i2.wp.com/.../Komik-Genius-Grandson-of-the-Loan-Shark-King.jpg <redacted query values: resize>` (image/jpeg, 16957 bytes, 214x315) |  |  |  |
| details author | PASS | Kim Gwi Rang Zephygaru |  |  |  |
| details artist | PASS | Leesam |  |  |  |
| details genres | PASS | Manhwa, Drama, Seinen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kim Mu-hyuk, cucu Raja Rentenir Cheon Tae-san, yang bahkan disegani oleh para elit kaya di Korea Selatan, berusaha keras untuk diakui sebagai anggota Keluarga Cheon. Meskipun berusaha keras, Mu-Hyuk dikhianati dan dibunuh oleh para pamannya dalam perebutan hak waris kakeknya. Namun, alih-alih mati, ia terbangun di tahun 1990-an, dengan kesempatan kedua untuk mengubah nasibnya. Bertekad untuk mencegah kematian neneknya, yang membesarkannya, dan merebut kembali warisan keluarga Cheon, Mu-hyuk bertekad untuk mempertahankan persahabatannya yang terputus dan membalas dendam secara brutal kepada para pamannya dan siapa pun yang menghalangi jalannya. Akankah Kim Mu-hyuk, cucu raja rentenir, dapat naik takhta Kerajaan Rentenir yang kejam, yang bahkan ditakuti oleh para gangster? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 119 chapters |  |  |  |
| chapter dates | PASS | 119 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 41 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://imageainewgeneration.lol/.../vo5GFC65FQWUkcyy6nQUjmxmMZxdHIM5lYRRaPK5.jpg` (image/jpeg, 80296 bytes, 720x960) |  |  |  |
