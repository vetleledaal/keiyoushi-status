# Extension Validation Report

- Extension: tachiyomi-all.mangalotus-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 2494989395865456034
- Source name: Manga Lotus (unoriginal)
- Source language: en
- Selected manga input: popular offset 0: ALMAGEST (Amii) – Hetalia Dj: ore ore [Eng] (`.../almagest-amii-hetalia-dj-ore-ore-eng`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | ALMAGEST (Amii) – Hetalia Dj: ore ore [Eng] (`.../almagest-amii-hetalia-dj-ore-ore-eng`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | lvlv – Paradiso Guardian Dj: Comics 1 [Uncensored] [Eng] (`.../lvlv-paradiso-guardian-dj-comics-1-uncensored-eng`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | ALMAGEST (Amii) – Hetalia Dj: ore ore [Eng] (`.../almagest-amii-hetalia-dj-ore-ore-eng`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ALMAGEST (Amii) – Hetalia Dj: ore ore [Eng] (`.../almagest-amii-hetalia-dj-ore-ore-eng`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../almagest-amii-hetalia-dj-ore-ore-eng`) |  | <1s |
| pages | `getPageList(chapter)` | success | 54 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ALMAGEST (Amii) – Hetalia Dj: ore ore \[Eng\], URL=`.../almagest-amii-hetalia-dj-ore-ore-eng` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangalotus.com/.../fimage_oreore.jpg` (image/jpeg, 23851 bytes, 209x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../almagest-amii-hetalia-dj-ore-ore-eng` |  |  |  |
| details thumbnail URL | PASS | `https://mangalotus.com/.../fimage_oreore.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Hetalia Dj, Yaoi DJs, ALMAGEST (Amii), English, France/ Francis Bonnefoy x England/ United Kingdom, Hard Yaoi, Hardcore, Hentai, Hentai Yaoi, Romance, Yaoi, Yaoi Hentai, Yaoi Sex |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | DJ: Hetalia Dj – ore ore<br><br>Language: English |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 54 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://yaoimangaonline.com/.../resized_oreore_1.jpg` (image/jpeg, 149059 bytes, 720x1033) |  |  |  |
