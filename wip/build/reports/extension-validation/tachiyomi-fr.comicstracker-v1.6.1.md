# Extension Validation Report

- Extension: tachiyomi-fr.comicstracker-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7468849851372889790
- Source name: Comics Tracker
- Source language: fr
- Selected manga input: popular offset 0: Docteur Fatalis: Le Livre de Fatalis (`.../docteur_fatalis_le_livre_de_fatalis_2025`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Docteur Fatalis: Le Livre de Fatalis (`.../docteur_fatalis_le_livre_de_fatalis_2025`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 106 | The Savage Dragon n°4 (`.../savage_dragon_1996_n4`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Docteur Fatalis: Le Livre de Fatalis (`.../docteur_fatalis_le_livre_de_fatalis_2025`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Docteur Fatalis: Le Livre de Fatalis (`.../docteur_fatalis_le_livre_de_fatalis_2025`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Édition (`.../docteur_fatalis_le_livre_de_fatalis_2025`) |  | <1s |
| pages | `getPageList(chapter)` | success | 147 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 106 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Docteur Fatalis: Le Livre de Fatalis, URL=`.../docteur_fatalis_le_livre_de_fatalis_2025` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 119/119 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 119/119 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://comics-tracker.net/.../docteur_fatalis_le_livre_de_fatalis_2025 <redacted query values: w>` (image/jpeg, 127139 bytes, 800x1224) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../docteur_fatalis_le_livre_de_fatalis_2025` |  |  |  |
| details thumbnail URL | PASS | `https://comics-tracker.net/.../docteur_fatalis_le_livre_de_fatalis_2025 <redacted query values: w>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Marvel Classics |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **Sommaire:** Books of Doom (2005) #1, Books of Doom (2005) #2, Books of Doom (2005) #3, Books of Doom (2005) #4, Books of Doom (2005) #5, Books of Doom (2005) #6 · **ISBN:** 9791039144582 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 147 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://images.comics-tracker.net/.../001.jpeg <redacted query values: p, e, and s>` (image/jpeg, 1158845 bytes, 2940x4497) |  |  |  |
