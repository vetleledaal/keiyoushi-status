# Extension Validation Report

- Extension: tachiyomi-es.capibaratraductor-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3335229490349802396
- Source name: CapibaraTraductor
- Source language: es
- Selected manga input: latest offset 0: Koori no Jouheki (`.../haruscan`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 75 | Blue Lock (`.../senshimanga`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 36 | S-Rank Boukensha de Aru Ore no Musume-tachi wa Juudo no Father-con deshita (`.../rakuen`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 36 | Koori no Jouheki (`.../haruscan`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 36 | ISEKAI GOURMET TSUMAMIGUI! (`.../okami`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Koori no Jouheki (`.../haruscan`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Koori no Jouheki (`.../haruscan`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 46 | Capítulo 1 - Capitulo  1 (`.../haruscan`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 19 |  |  | 1-10s |

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
| popular listing | PASS | 75 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Koori no Jouheki, URL=`koori-no-jouheki/haruscan` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Yowayowa-sensei, URL=`yowayowa-sensei/6ianfranc9` at page 1 offset 63 and page 2 offset 31 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 184/184 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 184/184 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://r2.capibaratraductor.com/.../1774900992907_845877.jpg` (image/jpeg, 342854 bytes, 842x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `koori-no-jouheki/haruscan` |  |  |  |
| details thumbnail URL | PASS | `https://r2.capibaratraductor.com/.../1774900992907_845877.jpg` |  |  |  |
| details author | PASS | Agasawa Koucha |  |  |  |
| details artist | PASS | Haru Scan |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Inepta para relacionarse con la gente, Hikawa Koyuki mantiene una barrera entre ella y los demás. Pasa su tiempo en el instituto aislada, completamente sola. Al menos hasta que conoce a Amamiya Minato, ¡quien por alguna razón no deja de acortar la distancia entre ellos! La distante Koyuki, la popular Miki, el desinhibido Minato y el simpático y amable Youta, miembro del equipo de baloncesto. ¡Esta es la historia de estos cuatro personajes un tanto complicados y su fascinante y torpe juventud! |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 46 name |  |  |  |
| chapters | PASS | 46 chapters |  |  |  |
| chapter dates | PASS | 46 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://r2.capibaratraductor.com/.../1774901652873_46783.png` (image/png, 1502292 bytes, 1999x1545) |  |  |  |
