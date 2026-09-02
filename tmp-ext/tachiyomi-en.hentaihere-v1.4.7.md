# Extension Validation Report

- Extension: tachiyomi-en.hentaihere-v1.4.7
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7266624490370375187
- Source name: HentaiHere
- Source language: en
- Selected manga input: latest offset 0: AkoSama (`.../S71594`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 40 | The Case Of A Gloomy Girl Who Became My Fuckbuddy After I Raped Her (`.../S58122`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 40 | Mimeuruwashi Urara-kun (`.../S60535`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 40 | AkoSama (`.../S71594`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 40 | Miko-chan's Summer Break Science Project (`.../S71555`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | AkoSama (`.../S71594`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | AkoSama (`.../S71594`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | 46 - AkoSama: Issue 46 (`.../1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 32 |  |  | 1-10s |

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
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=AkoSama, URL=`.../S71594` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Lust Goddess, URL=`.../pdTBmb` at page 1 offset 31 and page 2 offset 32 |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Lust Goddess, URL=`.../pdTBmb` at page 1 offset 20 and page 2 offset 25 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaicdn.com/.../_S71594.jpg` (image/jpeg, 39239 bytes, 400x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../S71594` |  |  |  |
| details thumbnail URL | PASS | `https://hentaicdn.com/.../_S71594.jpg` |  |  |  |
| details author | PASS | Unknown |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Anal, Doujinshi, Serialized, Blow job, Bondage, Female Dominance, Foot job, Futa on Male, Partial Censorship, Shemale, Urethral Intercourse, X-Ray |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://hentaicdn.com/.../ccdn00001.jpg` (image/jpeg, 264909 bytes, 1280x1807) |  |  |  |
