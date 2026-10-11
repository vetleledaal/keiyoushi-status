# Extension Validation Report

- Extension: tachiyomi-id.kumopoi-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5610091745946956485
- Source name: KumoPoi
- Source language: id
- Selected manga input: popular offset 0: Love Quest (`.../love-quest`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Love Quest (`.../love-quest`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Boarding Diary (Uncensored) (`.../boarding-diary-uncensored`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Love and Risk (`.../love-and-risk`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | My Aunt in Puberty (`.../my-aunt-in-puberty`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 10 | Love and Risk (`.../love-and-risk`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Love Quest (`.../love-quest`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 37 | Chapter 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 29 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 2: title=Love Quest, URL=`.../love-quest` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 90/90 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 90/90 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://kumo.gorae.my.id/.../cms4wml8h0n3cit8bw46le8xg_1787495851581.webp` (image/webp (encoding: lossy), 87862 bytes, 640x896) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../love-quest` |  |  |  |
| details thumbnail URL | PASS | `https://kumo.gorae.my.id/.../cms4wml8h0n3cit8bw46le8xg_1787495851581.webp` |  |  |  |
| details author | PASS | QRQ |  |  |  |
| details artist | PASS | QRQ |  |  |  |
| details genres | PASS | Comedy, Drama, Romance, Slice of Life, Seinen, Blowjob, Story Arc, Fingering, Cunnilingus, Big Breast, Full Color, Adult, Stocking, Business Suit, Pantyhose |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Bahkan di perusahaan game yang dipenuhi lembur, perasaan tetap tidak bisa ditekan! Kehidupan kantor rahasia para anak muda yang tak mau menyerah pada pekerjaan maupun cinta pun dimulai!<br>“Aneh… kenapa aku terus tertangkap oleh tatapanmu?” |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 37 chapters |  |  |  |
| chapter dates | PASS | 37 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 29 HTTP page URLs |  |  |  |
| duplicate page URLs | UNUSUAL | Duplicate page URLs: `https://api.kumopoi.com/.../deliver <redacted query values: token>` at pages 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://api.kumopoi.com/.../deliver <redacted query values: token>` (image/webp (encoding: lossless), 491346 bytes, 843x1264) |  |  |  |
