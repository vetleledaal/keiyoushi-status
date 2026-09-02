# Extension Validation Report

- Extension: tachiyomi-fr.phenixscansco-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 34
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6081284597648692367
- Source name: Phenix Scans (unoriginal)
- Source language: fr
- Selected manga input: popular offset 0: The Beginning After the End (`.../the-beginning-after-the-end`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | The Beginning After the End (`.../the-beginning-after-the-end`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 12 | Logging 10 000 Years Into the Future (`.../logging-10-000-years-into-the-future`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | Global Awakening: The Synthesis Master Starts with an Undead Army (`.../global-awakening-the-synthesis-master-starts-with-an-undead-army`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | The Beginning After the End (`.../the-beginning-after-the-end`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | The Beginning After the End (`.../the-beginning-after-the-end`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 270 | Chapter 1 (`.../1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 44 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Beginning After the End, URL=`the-beginning-after-the-end` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 35/35 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 35/35 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://api.phenix-scans.co/.../the-beginning-after-the-end.webp` (image/webp (encoding: lossy), 53356 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `the-beginning-after-the-end` |  |  |  |
| details thumbnail URL | PASS | `https://api.phenix-scans.co/.../the-beginning-after-the-end.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The Beginning After the End :<br><br>Grey était roi dans un monde où, pour limiter les bains de sangs, seuls les souverains devaient s’affronter lors de conflits. Il était le plus grand guerrier de son royaume et n’avait jamais perdu un seul combat. Alors qu’il s’était simplement endormi, il se réveille dans un corps de bébé, entouré de personnes qu’il ne connaît pas. Il s’appelle maintenant Arthur et il va devoir rapidement s’adapter à son nouvel environnement !<br><br> <br><br>Heureusement pour lui, dans cette vie il n’est pas orphelin, ses parents sont aux petits soins et le couvrent d’attention. Ce qui lui rend la vie un peu difficile vu qu’il ne peut pas leur montrer qu’il n’est pas un enfant normal. Cependant, lorsqu’il réussit à créer son noyau de mana à trois ans à peine, détruisant sa maison au passage, ses parents sont bien obligés de se rendre compte que leur fils est un génie. Si pendant les deux années qui suivent ils arrivent à s’occuper de son éducation, en tant qu’anciens aventuriers, ils maîtrisent plus que correctement le mana. Une chose devient rapidement évidente, Arthur ne pourra pas développer tout son potentiel sans un professeur plus compétent… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 270 chapters |  |  |  |
| chapter dates | PASS | 270 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 44 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://api.phenix-scans.co/.../1.webp` (image/jpeg, 40481 bytes, 700x1890; server Content-Type: image/webp) |  |  |  |
