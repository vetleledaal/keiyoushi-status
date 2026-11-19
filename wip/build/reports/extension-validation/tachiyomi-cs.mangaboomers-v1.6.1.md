# Extension Validation Report

- Extension: tachiyomi-cs.mangaboomers-v1.6.1
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
- Source ID: 6514091602606681124
- Source name: Manga Boomers
- Source language: cs
- Selected manga input: popular offset 0: Solo Leveling (`.../198`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Solo Leveling (`.../198`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | See You in My 19th Life (`.../255`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Solo Leveling (`.../198`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Solo Leveling (`.../198`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 200 | 1. kapitola (`.../10555`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 1 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Solo Leveling, URL=`198` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manga-boomers.cz/.../solo-leveling.jpg` (image/jpeg, 56950 bytes, 352x550) |  |  |  |
| details identity | PASS | Details preserved selected URL `198` |  |  |  |
| details thumbnail URL | PASS | `https://manga-boomers.cz/.../solo-leveling.jpg` |  |  |  |
| details author | PASS | Chugong, Jang Sung-rak |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Akční, Dobrodružné, Fantasy, Isekai, Shounen, Manhwa |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Před 10 lety se otevřela „brána“, jež spojuje náš svět se světem příšer. Toto otevření vyvolalo u mnoha obyčejných lidí probuzení zvláštních schopností, které jim umožňují tyto příšery zabíjet. Říká se jim „lovci“. Nicméně ne všichni z nich jsou silní. Mé jméno je Sung Jin-Woo a jsem lovec úrovně E, všichni mě znají pod přezdívkou „nejslabší na světě“. Pravidelně riskuji svůj život i v těch nejlehčích dungeonech, abych vydělal nějaké peníze. Ale návštěva jednoho dungeonu tohle všechno změní!<br><br>Alternativní názvy: 나 혼자만 레벨업<br><br>Stav originálu: Dokončeno |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 200 chapters |  |  |  |
| chapter dates | PASS | 200 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://manga-boomers.cz/.../01.jpg <redacted query values: v>` (image/jpeg, 427497 bytes, 940x1312) |  |  |  |
