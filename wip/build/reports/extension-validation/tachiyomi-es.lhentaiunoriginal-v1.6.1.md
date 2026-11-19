# Extension Validation Report

- Extension: tachiyomi-es.lhentaiunoriginal-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6809619983940497141
- Source name: lHentai (unoriginal)
- Source language: es
- Selected manga input: latest offset 0: Frieren Posada [ai generated] (`.../1359272`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 48 | 100-byougo ni Sex Suru Ane | 100 segundos para tener sexo con mi hermana (COMIC Penguin Club Sanzokuban 2020-07) (`.../1322034`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 48 | Emberlynn Pinkle intenta comprar algunos condones (Helluva Boss) (Ongoing) (`.../1323745`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 48 | Frieren Posada [ai generated] (`.../1359272`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 48 | Buena Vista (Uma Musume) [MTL] (`.../1357344`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Frieren Posada [ai generated] (`.../1359272`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Frieren Posada [ai generated] (`.../1359272`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Galería (`.../1359272`) |  | <1s |
| pages | `getPageList(chapter)` | success | 335 |  |  | <1s |

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
| popular listing | PASS | 48 entries |  |  |  |
| latest listing | PASS | 48 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Frieren Posada \[ai generated\], URL=`.../1359272` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 193/193 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 193/193 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://lhentai.com/.../cover.jpg` (image/jpeg, 71873 bytes, 350x511) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1359272` |  |  |  |
| details thumbnail URL | PASS | `https://lhentai.com/.../cover.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ai generated |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Set de imágenes · Español · Galería #1359272 · **Páginas:** 335 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 335 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://lhentai.com/.../1.jpg` (image/jpeg, 390698 bytes, 1248x1824) |  |  |  |
