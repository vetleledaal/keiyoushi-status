# Extension Validation Report

- Extension: tachiyomi-fr.lanortrad-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 28
- Lint: 1
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6624592926208705847
- Source name: LanorTrad
- Source language: fr
- Selected manga input: popular offset 0: Ao No Exorcist (`.../Ao%20No%20Exorcist`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Ao No Exorcist (`.../Ao%20No%20Exorcist`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Ao No Exorcist (`.../Ao%20No%20Exorcist`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Ao No Exorcist (`.../Ao%20No%20Exorcist`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 173 | Chapitre 1 (`.../Chapitre%201.html`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 72 |  |  | <1s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ao No Exorcist, URL=`Ao No Exorcist` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 11/11 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 11/11 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i.postimg.cc/.../Ao-No-Exorcist.jpg` (image/jpeg, 172073 bytes, 507x800) |  |  |  |
| details identity | PASS | Details preserved selected URL `Ao No Exorcist` |  |  |  |
| details thumbnail URL | PASS | `https://i.postimg.cc/.../Ao-No-Exorcist.jpg` |  |  |  |
| details author | PASS | LanorTrad |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Aventure, Fantasy, LanorTrad |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Rin Okumura est un adolescent qui découvre un jour qu'il est le fils de Satan. Déterminé à devenir un exorciste pour vaincre Satan... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 173 chapters |  |  |  |
| chapter dates | LINT | All 173 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=173 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 72 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://lanortrad.com/.../001.jpg` (image/jpeg, 367803 bytes, 1200x1800) |  |  |  |
