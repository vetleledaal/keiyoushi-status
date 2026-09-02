# Extension Validation Report

- Extension: tachiyomi-id.komiku-v1.4.21
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
- Source ID: 4838485846640015979
- Source name: Komiku
- Source language: id
- Selected manga input: popular offset 0: One Piece (`.../komik-one-piece-indo`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | One Piece (`.../komik-one-piece-indo`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 10 | Black Clover (`.../black-clover-indonesia`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 10 | Reincarnated Escort Warrior (`.../reincarnated-escort-warrior`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 10 | The Heavenly Path's Annihilation (`.../the-heavenly-paths-annihilation`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | One Piece (`.../komik-one-piece-indo`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | One Piece (`.../komik-one-piece-indo`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1210 | Chapter 1 (`.../one-piece-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 52 |  |  | 1-10s |

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
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 42/42 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 42/42 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://thumbnail.komiku.org/.../manga_img_horizontal-Manga-One-Piece.jpg` (image/jpeg, 73463 bytes, 868x485) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../komik-one-piece-indo` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://thumbnail.komiku.to/.../manga_thumbnail-Komik-One-Piece.jpg` (image/jpeg, 176689 bytes, 500x785) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Fantasy, Shounen, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | One Piece mengikuti petualangan Monkey D. Luffy, seorang pemuda yang bermimpi menjadi Raja Bajak Laut dengan menemukan harta karun legendaris bernama One Piece. Dalam perjalanannya, Luffy membentuk kru yang terdiri dari berbagai karakter unik dan kuat, masing-masing memiliki tujuan dan impian mereka sendiri. Bersama-sama, mereka menghadapi berbagai rintangan, musuh tangguh, dan misteri dunia yang luas. Cerita ini memberikan gambaran tentang persahabatan, keberanian, dan semangat pantang menyerah saat para karakter tidak hanya berjuang untuk kekayaan atau kekuasaan, tetapi juga untuk melindungi nilai-nilai yang mereka percayai. One Piece juga mengeksplorasi dunia yang penuh dengan kerajaan, bajak laut, dan Pemerintah Dunia yang berusaha mengendalikan lautan. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1210 chapters |  |  |  |
| chapter dates | PASS | 1210 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://image2.komiku.to/.../komiku-promosi.webp` (image/webp (container: extended), 57930 bytes, 1301x488) |  |  |  |
