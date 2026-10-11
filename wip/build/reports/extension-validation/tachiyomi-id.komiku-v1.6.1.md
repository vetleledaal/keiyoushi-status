# Extension Validation Report

- Extension: tachiyomi-id.komiku-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 0
- Warnings: 3
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4838485846640015979
- Source name: Komiku
- Source language: id
- Selected manga input: popular offset 0: One Piece (`.../komik-one-piece-indo`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | One Piece (`.../komik-one-piece-indo`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | Black Clover (`.../black-clover-indonesia`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | Sword Art Online Unital Ring (`.../sword-art-online-unital-ring`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | My Daddy Hid His Power (`.../my-daddy-hid-his-power`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | One Piece (`.../komik-one-piece-indo`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One Piece (`.../komik-one-piece-indo`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1214 | Chapter 1 (`.../one-piece-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 51 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=One Piece, URL=`.../komik-one-piece-indo` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=My Daddy Hid His Power, URL=`.../my-daddy-hid-his-power` at page 1 offset 9 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 42/42 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 42/42 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://thumbnail.komiku.org/.../manga_img_horizontal-Manga-One-Piece.jpg` (image/jpeg, 176689 bytes, 500x785) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../komik-one-piece-indo` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://thumbnail.komiku.to/.../manga_thumbnail-Komik-One-Piece.jpg` was not downloaded |  |  |  |
| details author | PASS | Eiichiro Oda |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Fantasy, Shounen, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | One Piece mengikuti petualangan Monkey D. Luffy, seorang pemuda yang bermimpi menjadi Raja Bajak Laut dengan menemukan harta karun legendaris bernama One Piece. Dalam perjalanannya, Luffy membentuk kru yang terdiri dari berbagai karakter unik dan kuat, masing-masing memiliki tujuan dan impian mereka sendiri. Bersama-sama, mereka menghadapi berbagai rintangan, musuh tangguh, dan misteri dunia yang luas. Cerita ini memberikan gambaran tentang persahabatan, keberanian, dan semangat pantang menyerah saat para karakter tidak hanya berjuang untuk kekayaan atau kekuasaan, tetapi juga untuk melindungi nilai-nilai yang mereka percayai. One Piece juga mengeksplorasi dunia yang penuh dengan kerajaan, bajak laut, dan Pemerintah Dunia yang berusaha mengendalikan lautan. One Piece mengikuti petualangan Monkey D. Luffy, seorang pemuda yang bermimpi menjadi Raja Bajak Laut dengan menemukan harta karun legendaris bernama One Piece. Dalam perjalanannya, Luffy membentuk kru yang terdiri dari berbagai karakter unik dan kuat, masing-masing memiliki tujuan dan impian mereka sendiri. Bersama-sama, mereka menghadapi berbagai rintangan, musuh tangguh, dan misteri dunia yang luas. Cerita ini memberikan gambaran tentang persahabatan, keberanian, dan semangat pantang menyerah saat para karakter tidak hanya berjuang untuk kekayaan atau kekuasaan, tetapi juga untuk melindungi nilai-nilai yang mereka percayai. One Piece juga mengeksplorasi dunia yang penuh dengan kerajaan, bajak laut, dan Pemerintah Dunia yang berusaha mengendalikan lautan.<br><br>Judul Alternatif: One Piece: Harta Karun Legendaris |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1214 chapters |  |  |  |
| chapter dates | PASS | 1214 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 51 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://api.komiku.org/.../manga <redacted query values: orderby>` to `https://api.komiku.org/.../manga <redacted query values: orderby>` (1 redirects); popular: `https://api.komiku.org/.../2 <redacted query values: orderby>` to `https://api.komiku.org/.../2 <redacted query values: orderby>` (1 redirects) |  |  |  |
| page load | PASS | `https://image2.komiku.to/.../787279-1.jpg` (image/jpeg, 167064 bytes, 700x1100) |  |  |  |
