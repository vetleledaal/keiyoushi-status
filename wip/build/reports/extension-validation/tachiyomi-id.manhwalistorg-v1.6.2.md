# Extension Validation Report

- Extension: tachiyomi-id.manhwalistorg-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source theme: mangathemesia
- Source ID: 1031213229391436059
- Source name: IsekaiKomik
- Source language: id
- Selected manga input: popular offset 0: The Crow’s Prince (`.../the-crows-prince`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | The Crow’s Prince (`.../the-crows-prince`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | Tomb Raider King (`.../tomb-raider-king`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | Mercenary Enrollment (`.../mercenary-enrollment`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | All My Alter Egos Are Tycoons (`.../all-my-alter-egos-are-tycoons`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Crow’s Prince (`.../the-crows-prince`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 107 | Chapter 1 (`.../the-crows-prince-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 233 |  |  | 1-10s |

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
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 120/120 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 120/120 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ch1.isekaikomik.site/.../The-Crows-Prince-200x300.jpeg` (image/jpeg, 19691 bytes, 200x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-crows-prince` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://ch1.isekaikomik.site/.../The-Crows-Prince.jpeg` (image/jpeg, 95513 bytes, 600x900) |  |  |  |
| details author | PASS | Silvestar |  |  |  |
| details artist | PASS | Glee |  |  |  |
| details genres | PASS | Animals, Comedy, Drama, Fantasy, Game, Isekai, Reincarnation, Romance, Supernatural, Manhwa |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Setelah meninggal dalam kecelakaan, dia bereinkarnasi dalam sebuah otome game. …Sebagai Burung Gagak! Saya tidak percaya bahwa saya adalah seekor burung gagak! Bukan karakter tambahan, tapi burung gagak! Saat aku mencari seseorang di sekitarku… Orang pertama yang muncul adalah Putra Mahkota. “Bagaimana kamu bisa begitu cantik, Reinel?” “Cawk Cawk, Cawk! (Bawa aku bersamamu dan besarkan aku!)” Putra Mahkota, Kamut, memberiku nama dan memperlakukanku dengan cinta. Lagipula aku hanya seekor burung gagak, tak masalah jika aku menyukainya atau hatiku berdebar karenanya. Tidak ada masalah sampai… “Halo, Reinel?” “Apa yang tiba-tiba terjadi padaku?”<br><br>Alternative Names: <br>- Of All Things<br>- I Became a Crow<br>- Hapir-imyeon Kkamagwi-ga Doeeo Beoryeotda<br>- 하필이면 까마귀가 되어버렸다 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 107 chapters |  |  |  |
| chapter dates | PASS | 107 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 233 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.isekaikomik.com/.../001.webp` (image/webp (encoding: lossy), 43964 bytes, 760x550) |  |  |  |
