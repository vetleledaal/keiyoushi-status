# Extension Validation Report

- Extension: tachiyomi-es.sapphirescan-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8955531858664387570
- Source name: SapphireScan
- Source language: es
- Selected manga input: popular offset 0: Sairin Yuusha no Fukushuu Hanashi (`.../sairin-yuusha-no-fukushuu-hanashi.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 8 | Sairin Yuusha no Fukushuu Hanashi (`.../sairin-yuusha-no-fukushuu-hanashi.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | El yerno más fuerte de la historia. (`.../el-yerno-mas-fuerte-de-la-historia.html`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 8 | El último rey dragón (`.../el-ultimo-rey-dragon.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Sairin Yuusha no Fukushuu Hanashi (`.../sairin-yuusha-no-fukushuu-hanashi.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sairin Yuusha no Fukushuu Hanashi (`.../sairin-yuusha-no-fukushuu-hanashi.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 22 | Capítulo 1 (`.../capitulo-1_14.html`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 40 |  |  | 1-10s |

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
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sairin Yuusha no Fukushuu Hanashi, URL=`.../sairin-yuusha-no-fukushuu-hanashi.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 37/37 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 37/37 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../SAIRIN%20YUUSHA%20.jpg` (image/jpeg, 19586 bytes, 141x200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../sairin-yuusha-no-fukushuu-hanashi.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../SAIRIN%20YUUSHA%20.jpg` (image/jpeg, 155045 bytes, 600x853) |  |  |  |
| details author | PASS | USAKI Usagi |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Isekai, Magic |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Amatsuki Iori era un estudiante de secundaria convocado a un mundo paralelo y comenzó a luchar como un héroe para salvar el país. Mientras intentaba salvar el mundo, sus compañeros de confianza lo matan. Justo cuando Iori había pensado que había muerto, abre los ojos y descubre que había sido convocado nuevamente, pero esta vez era como un héroe para subyugar al rey demonio que él mismo no había podido derrotar antes. Luego se da cuenta de que en el fondo de él, cuando una vez fue el héroe al mando y al frente de la batalla, aparece en su mente la figura de sus compañeros. \[... haré que se arrepientan de haberme traicionado\] Apareció ante Iori, quien había sido impulsada por el odio, una ex niña rey demonio que deseaba una venganza similar. En su segunda venida como héroe en este mundo, arroja sus ideales, |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 22 chapters |  |  |  |
| chapter dates | PASS | 22 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../0.jpg` (image/jpeg, 315974 bytes, 1600x777) |  |  |  |
