# Extension Validation Report

- Extension: tachiyomi-id.keikomik-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 9193340322612780041
- Source name: Keikomik
- Source language: id
- Selected manga input: popular offset 0: Magic Emperor (`.../magic-emperor`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Magic Emperor (`.../magic-emperor`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 18 | Chronicles of the Lazy Sovereign (`.../chronicles-of-the-lazy-sovereign`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | Trash of the Count's Family (`.../trash-of-the-counts-family`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 18 | Overlord Of Sichuan (`.../overlord-of-sichuan`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 10 | Magic Emperor (`.../magic-emperor`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Magic Emperor (`.../magic-emperor`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 227 | Chapter 711 (`.../magic-emperor-chapter-711`) |  | <1s |
| pages | `getPageList(chapter)` | success | 9 |  |  | 1-10s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Magic Emperor, URL=`.../magic-emperor` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 82/82 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 82/82 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://kreisnow.web.id/.../Magic-emperor.webp` (image/webp (encoding: lossy), 66794 bytes, 512x827) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../magic-emperor` |  |  |  |
| details thumbnail URL | PASS | `https://kreisnow.web.id/.../Magic-emperor.webp` |  |  |  |
| details author | PASS | Wuer Manhua, Ye Xiao |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Wuxia, Harem, Magic, Martial Arts, Reincarnation, Supernatural, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★✬ 8.81<br>Manhua · 2019<br><br>Karena memiliki warisan Kaisar Iblis kuno, Kaisar Iblis Zhuo Yifan mengalami nasib sial karena dikhianati dan dibunuh oleh murid kepercayaannya. Setelah terlahir kembali, kultivasinya kembali ke nol dan dia dijebak oleh iblis hati, tidak diberi pilihan selain menjadi pengurus rumah tangga dari nona tertua Keluarga Luo. Dari menjadi Kaisar Sihir menjadi pengurus rumah tangga yang tidak penting, bagaimana dia bisa bergaul dengan "nona tertua iblis hati" dan kekuatan apa yang akan dia dapatkan untuk memimpin dirinya dan keluarga yang sedang merosot untuk bangkit kembali ke puncak benua!<br><br>**Alternative Names:**<br>- Demonic Emperor |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 227 chapters |  |  |  |
| chapter dates | PASS | 227 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://kreisnow.web.id/.../01.jpeg` (image/jpeg, 79709 bytes, 800x614) |  |  |  |
