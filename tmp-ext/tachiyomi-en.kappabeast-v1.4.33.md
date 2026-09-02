# Extension Validation Report

- Extension: tachiyomi-en.kappabeast-v1.4.33
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2598579144085032375
- Source name: Kappa Beast
- Source language: en
- Selected manga input: latest offset 0: Isekai Gurumet Tsumamigui (`.../Isekai-Gurumet-Tsumamigui`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | 'Ano Toki Tasukete Itadaita Monster Musume desu.' Isekai Ossan Kyoushi Totsuzen no Moteki ni Konwaku suru (`.../ano-toki-tasukete-itadaita-monster-musume-desu-isekai-ossan-kyoushi-totsuzen-no-moteki-ni-konwaku-suru`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Isekai Gurumet Tsumamigui (`.../Isekai-Gurumet-Tsumamigui`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Isekai Gurumet Tsumamigui (`.../Isekai-Gurumet-Tsumamigui`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Isekai Gurumet Tsumamigui (`.../Isekai-Gurumet-Tsumamigui`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 5 | Chapter 1 (`.../1.0`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 32 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Isekai Gurumet Tsumamigui, URL=`Isekai-Gurumet-Tsumamigui#iwyuvchbi7xfhiug9hfw5pbp` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://strapi.kappabeast.com/.../iseka_gourmetp1_5c9e2541c2.png` (image/png, 85868 bytes, 316x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `Isekai-Gurumet-Tsumamigui#iwyuvchbi7xfhiug9hfw5pbp` |  |  |  |
| details thumbnail URL | PASS | `https://strapi.kappabeast.com/.../iseka_gourmetp1_5c9e2541c2.png` |  |  |  |
| details author | PASS | Shiroya Maken |  |  |  |
| details artist | PASS | Shiroya Maken |  |  |  |
| details genres | PASS | Fantasy, Another World, Gourmet, Large Breast, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Go to another world, eat delicious food, and "eat" married women while you're at it!?<br><br>Several years have passed since the reincarnated hero defeated the Demon King, allowing the real world and the other world to interact.<br>Kogarashi, an Otherworld Investigator, travels to various regions to investigate the traces left behind by the hero.<br>He is serious and completely devoted to his work... however, this man is an unparalleled foodie whose hobby is eating rare delicacies from the other world!!!<br>Moreover, when he consumes food from the other world, his skill causes him to release pheromones that charm the local inhabitants.<br>Even though he just wants to eat delicious things, for some reason Kogarashi ends up charming and doing it with the married women of the other world every time.<br><br>Why not enjoy a meal and get intimately close with beautiful women?<br>An eating tour (with a double meaning) otherworld life!!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../1.png` (image/png, 1128949 bytes, 726x1032) |  |  |  |
