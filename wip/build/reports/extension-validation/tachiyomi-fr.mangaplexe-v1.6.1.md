# Extension Validation Report

- Extension: tachiyomi-fr.mangaplexe-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 0
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1743749461698673410
- Source name: Mangaplexe
- Source language: fr
- Selected manga input: popular offset 0: Agnes Johnson (`.../agnes-johnson-hentai`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 224 | Agnes Johnson (`.../agnes-johnson-hentai`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Agnes Johnson (`.../agnes-johnson-hentai`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Agnes Johnson (`.../agnes-johnson-hentai`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Images (`.../agnes-johnson-hentai`) |  | <1s |
| pages | `getPageList(chapter)` | success | 11 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 224 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Agnes Johnson, URL=`.../agnes-johnson-hentai` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 225/225 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 225/225 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.mangaplexe.com/.../Agnes-Johnson-Hentai-Bienvenue-Chez-Les-Loud-Porno-The-Loud-House-Images-x-et-photos-de-sexe-gratuites.jpeg` (image/jpeg, 94409 bytes, 800x1260) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../agnes-johnson-hentai` |  |  |  |
| details thumbnail URL | PASS | `https://www.mangaplexe.com/.../Agnes-Johnson-Hentai-Bienvenue-Chez-Les-Loud-Porno-The-Loud-House-Images-x-et-photos-de-sexe-gratuites.jpeg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Bienvenue Chez Les Loud |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **Images:** 11<br><br>Découvrez les nouvelles images de sexe gratuit de **Agnes Johnson Hentai** de la \[parodie porno\](https://www.mangaplexe.com/.../parodies-hentai) de la série \[Bienvenue Chez Les Loud\](https://www.mangaplexe.com/.../bienvenue-chez-les-loud-hentai) (The Loud House) et regardez cette héroïne dans des photos x non censurées. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.mangaplexe.com/.../Agnes-Johnson-a-sa-chatte-de-yuri-caressee-par-la-milf-Rita-Bienvenue-Chez-Les-Loud-Hentai.jpeg` (image/jpeg, 83501 bytes, 1920x1199) |  |  |  |
