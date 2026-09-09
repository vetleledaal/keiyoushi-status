# Extension Validation Report

- Extension: tachiyomi-id.hentaicrot-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: oceanwp
- Source ID: 1764268677652741702
- Source name: Hentai Crot
- Source language: id
- Selected manga input: popular offset 0: Shiri de Onna o Miwakeru Ore wa Onna Joushi no Yowami o Nigiru 1 (`.../shiri-de-onna-o-miwakeru-ore-wa-onna-joushi-no-yowami-o-nigiru-1`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 8 | Shiri de Onna o Miwakeru Ore wa Onna Joushi no Yowami o Nigiru 1 (`.../shiri-de-onna-o-miwakeru-ore-wa-onna-joushi-no-yowami-o-nigiru-1`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 8 | Kurokami Onna no Fudeoroshi ~Himitsu no Heya de Nakadashi Sasete Ageru wa~ (`.../kurokami-onna-no-fudeoroshi-himitsu-no-heya-de-nakadashi-sasete-ageru-wa`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Shiri de Onna o Miwakeru Ore wa Onna Joushi no Yowami o Nigiru 1 (`.../shiri-de-onna-o-miwakeru-ore-wa-onna-joushi-no-yowami-o-nigiru-1`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Shiri de Onna o Miwakeru Ore wa Onna Joushi no Yowami o Nigiru 1 (`.../shiri-de-onna-o-miwakeru-ore-wa-onna-joushi-no-yowami-o-nigiru-1`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter 1 (`.../shiri-de-onna-o-miwakeru-ore-wa-onna-joushi-no-yowami-o-nigiru-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 28 |  |  | 1-10s |

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
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Shiri de Onna o Miwakeru Ore wa Onna Joushi no Yowami o Nigiru 1, URL=`.../shiri-de-onna-o-miwakeru-ore-wa-onna-joushi-no-yowami-o-nigiru-1` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 17/17 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 17/17 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaicrot.com/.../Shiri-de-Onna-o-Miwakeru-Ore-wa-Onna-Joushi-no-Yowami-o-Nigiru-1-cover-200x285.jpg` (image/jpeg, 12796 bytes, 200x285) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../shiri-de-onna-o-miwakeru-ore-wa-onna-joushi-no-yowami-o-nigiru-1` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hentaicrot.com/.../Shiri-de-Onna-o-Miwakeru-Ore-wa-Onna-Joushi-no-Yowami-o-Nigiru-1-cover.jpg` (image/jpeg, 209575 bytes, 1360x1920) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Blowjob, Booty, Creampie, Doggy Style, Pubic Hair, Toket Besar, Uncensored |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Baca komik hentai manga xxx bokep sex porn Shiri de Onna o Miwakeru Ore wa Onna Joushi no Yowami o Nigiru 1. Jumlah halaman : 28 Bahasa : Indonesia Artists : ECOheeky |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 28 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.openhentai.net/.../Blackmailing-My-Boss-Using-My-Power-To-Recognize-Women-By-Their-Asses-%20(1).webp` (image/webp (container: extended), 476164 bytes, 1360x1920) |  |  |  |
