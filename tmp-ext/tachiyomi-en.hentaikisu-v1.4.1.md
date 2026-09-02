# Extension Validation Report

- Extension: tachiyomi-en.hentaikisu-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 29
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5345672200867563334
- Source name: HentaiKisu
- Source language: en
- Selected manga input: popular offset 0: Maa... Sounee (`.../39054`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 60 | Maa... Sounee (`.../39054`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 60 | Mesugaki Wakarase Juku 1 | Mesugaki Correction School 1 (`.../8787`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Maa... Sounee (`.../39054`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Maa... Sounee (`.../39054`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../39054`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 25 |  |  | 1-10s |

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
| popular listing | PASS | 60 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Maa... Sounee, URL=`.../39054` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Akuma no Shouna \| The Devil's Whore, URL=`.../32601` at page 1 offset 45 and page 2 offset 3, title=Blend S Bonyuubu (decensored), URL=`.../21083` at page 1 offset 46 and page 2 offset 4, title=Summer Children – Neon Genesis Evangelion Parody Anthology, URL=`.../3678` at page 1 offset 47 and page 2 offset 6, title=Tenyou Rikigaku, URL=`.../32362` at page 1 offset 48 and page 2 offset 8, title=Meguru Hon 2019 Natsu, URL=`.../35452` at page 1 offset 49 and page 2 offset 14, title=Michibiki no Machi ni Aru Hisoyakana Jouji \| The Secret Matters of the Guiding Land, URL=`.../16005` at page 1 offset 50 and page 2 offset 18, title=Shiranui Kowai., URL=`.../6022` at page 1 offset 51 and page 2 offset 19, title=EZ DO xxx, URL=`.../1930` at page 1 offset 52 and page 2 offset 22, title=Okaa-san no Kakushigoto \| Mom's Secret, URL=`.../32907` at page 1 offset 53 and page 2 offset 25, title=Mushroom Chance!, URL=`.../24208` at page 1 offset 54 and page 2 offset 27, title=Hadaka no Imouto-sama. \| The Nude Sister, URL=`.../48028` at page 1 offset 55 and page 2 offset 30, title=Getter Robo Tai Kongou Yon Shimai \| Getter Robo vs The Kongou Four Sisters, URL=`.../46493` at page 1 offset 56 and page 2 offset 31, title=Maikaze Kekkon X-kame, URL=`.../49316` at page 1 offset 57 and page 2 offset 34, title=KodoOji to Boku, URL=`.../34480` at page 1 offset 58 and page 2 offset 37, title=Monpiyo., URL=`.../33206` at page 1 offset 59 and page 2 offset 41 |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://h1.kmcdn.top/.../81720.jpg` (image/jpeg, 22884 bytes, 350x510) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../39054` |  |  |  |
| details thumbnail URL | PASS | `https://h1.kmcdn.top/.../81720.jpg` |  |  |  |
| details author | PASS | oharaibako |  |  |  |
| details artist | PASS | oosawa ofuda |  |  |  |
| details genres | PASS | lolicon, schoolgirl uniform, sole female, sole male, mosaic censorship |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://h1.kmcdn.top/.../0.jpg` (image/jpeg, 86346 bytes, 910x1326) |  |  |  |
