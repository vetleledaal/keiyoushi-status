# Extension Validation Report

- Extension: tachiyomi-fr.lanortrad-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6624592926208705847
- Source name: LanorTrad
- Source language: fr
- Selected manga input: popular offset 0: Tougen Anki (`.../Tougen%20Anki`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Tougen Anki (`.../Tougen%20Anki`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | Ao No Exorcist (`.../Ao%20No%20Exorcist`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Tougen Anki (`.../Tougen%20Anki`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tougen Anki (`.../Tougen%20Anki`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 257 | Chapitre 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 71 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tougen Anki, URL=`Tougen Anki` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 21/21 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 21/21 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://lanortrad.com/.../TougenAnki.jpg` (image/jpeg, 290624 bytes, 970x1500) |  |  |  |
| details identity | PASS | Details preserved selected URL `Tougen Anki` |  |  |  |
| details thumbnail URL | PASS | `https://lanortrad.com/.../TougenAnki.jpg` |  |  |  |
| details author | PASS | Yura Urushibara |  |  |  |
| details artist | PASS | Yura Urushibara |  |  |  |
| details genres | PASS | Action, Drame, Fantaisie |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Shiki Ichinose est aux premiers abords un simple ado rebelle mais il se trouve qu'il est l'héritier du sang d'Oni. Ce dernier a vécu toute son enfance en ignorant ce qu'il était vraiment. C'est lorsqu'un inconnu tente de l'assassiner chez lui qu'il se voit révéler la vérité par son beau-père. L'homme qui tenta de s'en prendre à Shiki est un Momotarou, les Oni et les Momotarou n'ont jamais pu coexister et ont toujours mené une guerre sans fin. Que fera Shiki après toutes ces révélations ? Pourra-t-il réconcilier les Oni et Momotarou ? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 257 chapters |  |  |  |
| chapter dates | LINT | 251 of 257 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=251 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 71 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://lanortrad.com/.../001.webp` (image/webp (encoding: lossy), 809024 bytes, 1920x2847) |  |  |  |
