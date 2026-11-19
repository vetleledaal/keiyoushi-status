# Extension Validation Report

- Extension: tachiyomi-pt.ler999-v1.6.20
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: zeistmanga
- Source ID: 11864058740306611
- Source name: Ler 999
- Source language: pt-BR
- Selected manga input: popular offset 0: Albanara of the Gods (`.../albanara-of-gods.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 7 | Albanara of the Gods (`.../albanara-of-gods.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 7 | What Level Are You, How Dare You Pretend in Front of My Seven Senior Sisters (`.../what-level-are-you-how-dare-you-pretend.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Albanara of the Gods (`.../albanara-of-gods.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Albanara of the Gods (`.../albanara-of-gods.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | Chapter 01 (`.../capitulo-01.html`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 46 |  |  | 1-10s |

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
| popular listing | PASS | 7 entries |  |  |  |
| latest listing | PASS | 7 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Albanara of the Gods, URL=`.../albanara-of-gods.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 15/15 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 15/15 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../The%20Part%20Time%20Nation%20of%20the%20Gods.jpg` (image/jpeg, 185686 bytes, 500x712) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../albanara-of-gods.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../The%20Part%20Time%20Nation%20of%20the%20Gods.jpg` (image/jpeg, 185686 bytes, 500x712) |  |  |  |
| details author | PASS | God Thingjak, Jeon Tae Hwan |  |  |  |
| details artist | PASS | Deany, Mir |  |  |  |
| details genres | PASS | Action, Drama, Fantasy, Shounen |  |  |  |
| details status | PASS | CANCELLED (5) |  |  |  |
| details description | PASS | Yu Damdeok, que trabalhava meio período por não possuir talento, foi atingido por um raio e perdeu a consciência, sendo levado para o ventre de Deus. O \[Anúncio de Recrutamento\] dos Deuses te espera. Logo depois, uma janela de status desconhecida apareceu na frente de seus olhos e ele concordou trabalhar meio período para os Deuses pensando que não faria mal… A nação dos deuses que tinha o objetivo de mudar a sua vida e o espírito aventureiro de Yu Damdeok, o tornaram um deus de baixo rank em Parttimeia! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 46 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../001.jpg` (image/jpeg, 270637 bytes, 1200x800) |  |  |  |
