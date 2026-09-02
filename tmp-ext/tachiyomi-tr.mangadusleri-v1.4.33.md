# Extension Validation Report

- Extension: tachiyomi-tr.mangadusleri-v1.4.33
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 29
- Lint: 0
- Warnings: 2
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1206358177665528952
- Source name: Mangadusleri
- Source language: tr
- Selected manga input: popular offset 0: Romper con la salvación (`.../romper-con-la-salvaci-n`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Romper con la salvación (`.../romper-con-la-salvaci-n`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 14 | Things That Deserve to Die (`.../things-that-deserve-to-die`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Codename Anastasia (`.../codename-anastasia`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 14 | When Life Gives You Tomatoes (`.../when-life-gives-you-tomatoes`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Romper con la salvación (`.../romper-con-la-salvaci-n`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Romper con la salvación Türkçe Oku (`.../romper-con-la-salvaci-n`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 4 | Bölüm 3 (`.../bolum-3`) |  | <1s |
| pages | `fetchPageList(chapter)` | error | 0 |  | java.io.IOException: Bu içeriği görüntülemek için lütfen WebView'ı (küre simgesini) açın ve giriş yapın! | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.io.IOException: Bu içeriği görüntülemek için lütfen WebView'ı (küre simgesini) açın ve giriş yapın! | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Romper con la salvación, URL=`.../romper-con-la-salvaci-n` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 77/77 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 77/77 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://mangadusleri.mom/.../nsfw-placeholder.jpg` -> 25 manga URLs (examples: `.../prison-breakfast`, `.../borderline`, `.../nice-to-see-you`) |  |  |  |
| thumbnail | PASS | `https://img.manhwaweb.top/.../cover-mYELWfG6-10973.webp` (image/webp (encoding: lossy), 60026 bytes, 600x900) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Romper con la salvación to Romper con la salvación Türkçe Oku |  |  |  |
| details thumbnail URL | PASS | `https://img.manhwaweb.top/.../cover-mYELWfG6-10973.webp` |  |  |  |
| details author | PASS | X |  |  |  |
| details artist | PASS | x |  |  |  |
| details genres | PASS | Drama, Yaoi, Romantik, +18 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | HİKAYENİN ÖZETİ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Bu içeriği görüntülemek için lütfen WebView'ı (küre simgesini) açın ve giriş yapın! |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
