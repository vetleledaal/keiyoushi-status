# Extension Validation Report

- Extension: tachiyomi-id.kumopoi-v1.6.5
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

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
| popular_next | `getPopularManga(2)` | success | 20 | Hypnotist Security Guard (`.../hypnotist-security-guard`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Ashita mo Tomodachi? (`.../ashita-mo-tomodachi`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Sukoshi Furyouppoi Onnanoko to Kyuujitsu ni Ie de Daradara Shitai Hon. (`.../sukoshi-furyouppoi-onnanoko-to-kyuujitsu-ni-ie-de-daradara-shitai-hon`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 10 | Love and Risk (`.../love-and-risk`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Love Quest (`.../love-quest`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 42 | Chapter 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 10 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Love Quest, URL=`.../love-quest` |  |  |  |
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
| chapters | PASS | 42 chapters |  |  |  |
| chapter dates | PASS | 42 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | UNUSUAL | Duplicate page URLs: `https://api.kumopoi.com/.../deliver <redacted query values: token>` at pages 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://api.kumopoi.com/.../deliver <redacted query values: token>` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
