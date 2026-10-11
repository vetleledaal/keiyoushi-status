# Extension Validation Report

- Extension: tachiyomi-th.sodsaime-v1.6.2
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
- Source theme: mangathemesia
- Source ID: 8174267898467838103
- Source name: สดใสเมะ
- Source language: th
- Selected manga input: popular offset 0: Martial Peak เทพยุทธ์เหนือโลก (`.../martial-peak-%E0%B9%80%E0%B8%97%E0%B8%9E%E0%B8%A2%E0%B8%B8%E0%B8%97%E0%B8%98%E0%B9%8C%E0%B9%80%E0%B8%AB%E0%B8%99%E0%B8%B7%E0%B8%AD%E0%B9%82%E0%B8%A5%E0%B8%81`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | Martial Peak เทพยุทธ์เหนือโลก (`.../martial-peak-%E0%B9%80%E0%B8%97%E0%B8%9E%E0%B8%A2%E0%B8%B8%E0%B8%97%E0%B8%98%E0%B9%8C%E0%B9%80%E0%B8%AB%E0%B8%99%E0%B8%B7%E0%B8%AD%E0%B9%82%E0%B8%A5%E0%B8%81`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 40 | Taming My Stepsister (`.../taming-my-stepsister`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 40 | Colori Colore Creare (`.../colori-colore-creare`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 40 | The Village’s Special Law (`.../the-villages-special-law`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Martial Peak เทพยุทธ์เหนือโลก (`.../martial-peak-%E0%B9%80%E0%B8%97%E0%B8%9E%E0%B8%A2%E0%B8%B8%E0%B8%97%E0%B8%98%E0%B9%8C%E0%B9%80%E0%B8%AB%E0%B8%99%E0%B8%B7%E0%B8%AD%E0%B9%82%E0%B8%A5%E0%B8%81`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Martial Peak เทพยุทธ์เหนือโลก (`.../martial-peak-%E0%B9%80%E0%B8%97%E0%B8%9E%E0%B8%A2%E0%B8%B8%E0%B8%97%E0%B8%98%E0%B9%8C%E0%B9%80%E0%B8%AB%E0%B8%99%E0%B8%B7%E0%B8%AD%E0%B9%82%E0%B8%A5%E0%B8%81`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3859 | ตอนที่ 1 (`.../martial-peak-%E0%B9%80%E0%B8%97%E0%B8%9E%E0%B8%A2%E0%B8%B8%E0%B8%97%E0%B8%98%E0%B9%8C%E0%B9%80%E0%B8%AB%E0%B8%99%E0%B8%B7%E0%B8%AD%E0%B9%82%E0%B8%A5%E0%B8%81-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 18 |  |  | 1-10s |

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
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Martial Peak เทพยุทธ์เหนือโลก, URL=`.../martial-peak-%E0%B9%80%E0%B8%97%E0%B8%9E%E0%B8%A2%E0%B8%B8%E0%B8%97%E0%B8%98%E0%B9%8C%E0%B9%80%E0%B8%AB%E0%B8%99%E0%B8%B7%E0%B8%AD%E0%B9%82%E0%B8%A5%E0%B8%81` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.xn--l3c0azab5a2gta.com/.../b13422542f56597aa62e83ad6fe1a470_Martial-Peak-1.jpg` (image/jpeg, 533605 bytes, 630x840) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../martial-peak-%E0%B9%80%E0%B8%97%E0%B8%9E%E0%B8%A2%E0%B8%B8%E0%B8%97%E0%B8%98%E0%B9%8C%E0%B9%80%E0%B8%AB%E0%B8%99%E0%B8%B7%E0%B8%AD%E0%B9%82%E0%B8%A5%E0%B8%81` |  |  |  |
| details thumbnail URL | PASS | `https://www.xn--l3c0azab5a2gta.com/.../b13422542f56597aa62e83ad6fe1a470_Martial-Peak-1.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Harem, Manhua, Martial arts, Seinen, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3859 chapters |  |  |  |
| chapter dates | PASS | 3859 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `.../martial-peak-%E0%B9%80%E0%B8%97%E0%B8%9E%E0%B8%A2%E0%B8%B8%E0%B8%97%E0%B8%98%E0%B9%8C%E0%B9%80%E0%B8%AB%E0%B8%99%E0%B8%B7%E0%B8%AD%E0%B9%82%E0%B8%A5%E0%B8%81-3664` at offsets 198, 199 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.xn--l3c0azab5a2gta.com/.../JL2UWIZVF6-1587189099.jpg` (image/jpeg, 146926 bytes, 800x1131) |  |  |  |
