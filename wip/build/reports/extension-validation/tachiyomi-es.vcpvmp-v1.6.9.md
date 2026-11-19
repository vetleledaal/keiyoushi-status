# Extension Validation Report

- Extension: tachiyomi-es.vcpvmp-v1.6.9
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source theme: vercomics
- Source ID: 8472215287946707583
- Source name: VCP
- Source language: es
- Selected manga input: popular offset 0: [Lednah] The XXX ADVENTURES of Dennis Sanchez parte 1 (Comic Porn) (`.../lednah-the-xxx-adventures-of-dennis-sanchez-parte-1-comic-porn`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | [Lednah] The XXX ADVENTURES of Dennis Sanchez parte 1 (Comic Porn) (`.../lednah-the-xxx-adventures-of-dennis-sanchez-parte-1-comic-porn`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | [Fakeryway] Queen Marika ought not to think so righteously of herself above The Tarnished… (Elden Ring) (`.../fakeryway-queen-marika-ought-not-to-think-so-righteously-of-herself-above-the-tarnished-elden-ring`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | [Lednah] The XXX ADVENTURES of Dennis Sanchez parte 1 (Comic Porn) (`.../lednah-the-xxx-adventures-of-dennis-sanchez-parte-1-comic-porn`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [Lednah] The XXX ADVENTURES of Dennis Sanchez parte 1 (Comic Porn) (`.../lednah-the-xxx-adventures-of-dennis-sanchez-parte-1-comic-porn`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | [Lednah] The XXX ADVENTURES of Dennis Sanchez parte 1 (Comic Porn) (`.../lednah-the-xxx-adventures-of-dennis-sanchez-parte-1-comic-porn`) |  | <1s |
| pages | `getPageList(chapter)` | success | 101 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[Lednah\] The XXX ADVENTURES of Dennis Sanchez parte 1 (Comic Porn), URL=`.../lednah-the-xxx-adventures-of-dennis-sanchez-parte-1-comic-porn` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://vercomicsporno.com/.../The-XXX-ADVENTURES-of-Dennis-Sanchez-parte-1-Lednah_069-320x440.jpg` (image/jpeg, 25166 bytes, 320x440) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../lednah-the-xxx-adventures-of-dennis-sanchez-parte-1-comic-porn` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Amor filial, Artist: Lednah, Big Cock, Big Tits, Blowjobs, Chicas Blancas, Chicas Follando, Chicas Pelirrojas, Corridas, Culonas, Cum, Deep Throat, Garganta Profunda, Hand Job, Hot Girls, Hot Mom, Lesbianas, Madre e hijo, Maduras, Mamadas, Masturbacion, Milf 3D, Oral, Oral sex, Paja, Tetonas, Trio |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 101 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://vercomicsporno.com/.../1` to `https://vercomicsporno.com/.../sex-comics` (1 redirects); popular: `https://vercomicsporno.com/.../1 <redacted query values: s>` to `https://vercomicsporno.com/.../sex-comics <redacted query values: s>` (1 redirects) |  |  |  |
| page load | PASS | `https://vercomicsporno.com/.../The-XXX-ADVENTURES-of-Dennis-Sanchez-parte-1-Lednah_000.jpg` (image/jpeg, 308070 bytes, 1280x1600) |  |  |  |
