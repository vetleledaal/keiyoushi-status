# Extension Validation Report

- Extension: tachiyomi-en.ninehentai-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7689490563697355048
- Source name: NineHentai
- Source language: en
- Selected manga input: latest offset 0: [Umamusuko] Lana's Mom, Lana and Glastrier (Pokémon) [English, Japanese] (`.../150174`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | The Busty Elf Can't Say No (`.../149903`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 18 | How I, a 2D-Obsessed Otaku, Fell for the Busty Idol Who Transferred to My School (`.../149904`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 18 | [Umamusuko] Lana's Mom, Lana and Glastrier (Pokémon) [English, Japanese] (`.../150174`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 18 | [Hot Milk] My childhood friend turned into a flashy gal, and even my wholesome underclassman got gender-swapped into a girl—now I've got a harem (`.../150156`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 18 | [Umamusuko] Lana's Mom, Lana and Glastrier (Pokémon) [English, Japanese] (`.../150174`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | [Umamusuko] Lana's Mom, Lana and Glastrier (Pokémon) [English, Japanese] (`.../150174`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../150174`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 12 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[Umamusuko\] Lana's Mom, Lana and Glastrier (Pokémon) \[English, Japanese\], URL=`.../150174` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 90/90 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 90/90 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i.9hentai.so/.../cover-small.jpg` (image/jpeg, 46254 bytes, 250x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../150174` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i.9hentai.so/.../cover.jpg` (image/jpeg, 82201 bytes, 350x496) |  |  |  |
| details author | PASS | Unknown circle |  |  |  |
| details artist | PASS | Umamusuko |  |  |  |
| details genres | PASS | Big Breasts, Cumflation, Milf |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Pages: 12 pages<br><br>Parody: Pokemon<br><br>Category: Doujinshi<br><br>Language: English |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://i.9hentai.so/.../1.jpg` (image/jpeg, 526555 bytes, 1280x1811) |  |  |  |
