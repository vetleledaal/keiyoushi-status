# Extension Validation Report

- Extension: tachiyomi-en.mangauno-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4237239660432093896
- Source name: Manga.uno
- Source language: en
- Selected manga input: latest offset 0: Josou Danshi wa Skirt wo Nugitai! (`.../josou-danshi-wa-skirt-wo-nugitai`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Chainsaw Man (`.../chainsaw-man`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | [Oshi no Ko] (`.../oshi-no-ko`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Josou Danshi wa Skirt wo Nugitai! (`.../josou-danshi-wa-skirt-wo-nugitai`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Albus Changes the World (`.../kaiten-no-albus`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Josou Danshi wa Skirt wo Nugitai! (`.../josou-danshi-wa-skirt-wo-nugitai`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Josou Danshi wa Skirt wo Nugitai! (`.../josou-danshi-wa-skirt-wo-nugitai`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 26 | Ch. 1 — Josou Danshi wa Skirt wo Nugitai! Chapter 1 (`.../8779385`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 37 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Josou Danshi wa Skirt wo Nugitai!, URL=`josou-danshi-wa-skirt-wo-nugitai` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://xz7.fstr-cdn.com/.../josou-danshi-wa-skirt-wo-nugitai.webp` (image/webp (encoding: lossy), 29202 bytes, 300x427) |  |  |  |
| details identity | PASS | Details preserved selected URL `josou-danshi-wa-skirt-wo-nugitai` |  |  |  |
| details thumbnail URL | PASS | `https://xz7.fstr-cdn.com/.../josou-danshi-wa-skirt-wo-nugitai.webp` |  |  |  |
| details author | PASS | Shinagire |  |  |  |
| details artist | PASS | Shinagire |  |  |  |
| details genres | PASS | Romance, Comedy, Crossdressing, School Life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Uichiro, a junior high boy, has a secret that he cannot tell his childhood friend Tama-chan. He has been dressing up as a girl for her sake because of her phobia of men. A thrilling and agonizing romantic comedy about a coming-of-age boy who continues to cross-dress for the girl he loves!<br><br><br><br>(Source: Ultra Jump, translated) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 26 chapters |  |  |  |
| chapter dates | PASS | 26 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 37 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://xz7.fstr-cdn.com/.../001.webp` (image/webp (encoding: lossy), 224332 bytes, 1200x861) |  |  |  |
