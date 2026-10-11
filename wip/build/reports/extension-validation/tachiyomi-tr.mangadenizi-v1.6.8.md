# Extension Validation Report

- Extension: tachiyomi-tr.mangadenizi-v1.6.8
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source ID: 5186628758186958017
- Source name: MangaDenizi
- Source language: tr
- Selected manga input: popular offset 0: Black Clover (`.../black-clover`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 15 | Black Clover (`.../black-clover`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 15 | The Strongest Sage with the Weakest Crest (`.../the-strongest-sage-with-the-weakest-crest`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 15 | One Piece (`.../one-piece`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 15 | MamaYuyu (`.../mamayuyu`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Black Clover (`.../black-clover`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Black Clover (`.../black-clover`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 393 | Bölüm 1: Çocuğun Yemini (`.../001`) |  | <1s |
| pages | `getPageList(chapter)` | success | 50 |  |  | <1s |

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
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Black Clover, URL=`.../black-clover` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangadenizi.net/.../cover.webp` (image/webp (encoding: lossy), 31642 bytes, 320x460) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../black-clover` |  |  |  |
| details thumbnail URL | PASS | `https://mangadenizi.net/.../cover.webp` |  |  |  |
| details author | PASS | Tabata Yuuki |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Komedi, Aksiyon, Macera, Fantastik |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Büyünün her şey olduğu bir dünyada yaşayan Asta ve Yuno aynı gün kilisenin önüne terk edilmiş iki yetimdir.İkisininde hayali aynıdır 'Büyücülük İmparatoru' olmak. Yuno yüksek büyü gücüne sahip yetenekli bir çocuk olmasına karşın Asta'nın hiç büyü gücü yoktur. Asta herkes tarafından dalga geçilen biri haline dönüşmesine rağmen akıl almaz bir pes etmeme duygusu vardır.Ancak bir gün herkesi şaşırtacak bir güç kazanır... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 393 chapters |  |  |  |
| chapter dates | PASS | 393 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 50 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.mangadenizi.net/.../001-b0808756bf008225c13a1f297aa76e950e240680.webp <redacted query values: scramble_grid and scramble_seed>` (image/jpeg, 207632 bytes, 800x800; server Content-Type: image/webp) |  |  |  |
