# Extension Validation Report

- Extension: tachiyomi-pt.shiraiscans-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 28
- Lint: 0
- Warnings: 1
- Skipped: 6
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8366859060427643716
- Source name: Shirai Scans
- Source language: pt-BR
- Selected manga input: popular offset 0: Quando o Lobo Negro me Chama (`.../obra.php <redacted query values: id>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 15 | Quando o Lobo Negro me Chama (`.../obra.php <redacted query values: id>`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 0 |  |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 5 | Estou em um Relacionamento Secreto com o Imperador, mas Não fazia Ideia (`.../obra.php <redacted query values: id>`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Quando o Lobo Negro me Chama (`.../obra.php <redacted query values: id>`) |  | 10s+ |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Quando o Lobo Negro me Chama (`.../obra.php <redacted query values: id>`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 5 | Capítulo 01 (`.../leitor.php <redacted query values: id_cap>`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: Script com dados das páginas não encontrado | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Script com dados das páginas não encontrado | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 5 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Quando o Lobo Negro me Chama, URL=`.../obra.php <redacted query values: id>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | FAIL | Page 2 is empty despite page 1 advertising a next page | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 21/21 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 21/21 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.shiraixis.space/.../quando-o-lobo-negro-me-chama-1794584253.webp` (image/webp (encoding: lossy), 61166 bytes, 500x724) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../obra.php <redacted query values: id>` |  |  |  |
| details thumbnail URL | PASS | `https://img.shiraixis.space/.../quando-o-lobo-negro-me-chama-1794584253.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Histórico, Romance, Sobrenatural, Transmigração, Viagem no tempo |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Yeonwu Chae, uma talentosa, porém solitária compositora coreana, se vê presa no submundo com sua família após um acidente de carro. Em sua primeira vida, ela se casa com Hyojo, que acaba por matá-la. Em sua segunda vida, ela se vinga tirando a própria vida diante dele. Mas, apesar de seu desejo desesperado por um fim, ela recebe uma segunda chance. Contudo, desta vez, em vez de encontrar Hyojo, ela é descoberta por Hwita, um homem misterioso com um lobo negro como espírito guardião. Será que Yeonwu conseguirá quebrar o ciclo e encontrar a verdadeira segurança neste submundo traiçoeiro? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Script com dados das páginas não encontrado |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://shiraixis.space/.../biblioteca.php <redacted query values: ajax, genero, q, and offset>` to `https://shiraixis.space/.../biblioteca <redacted query values: ajax, genero, q, and offset>` (1 redirects); popular: `https://shiraixis.space/.../biblioteca.php <redacted query values: ajax, genero, q, and offset>` to `https://shiraixis.space/.../biblioteca <redacted query values: ajax, genero, q, and offset>` (1 redirects); popular: `https://shiraixis.space/.../obra.php <redacted query values: id>` to `https://shiraixis.space/.../obra <redacted query values: id>` (1 redirects); popular: `https://shiraixis.space/.../biblioteca.php <redacted query values: ajax, genero, q, and offset>` to `https://shiraixis.space/.../biblioteca <redacted query values: ajax, genero, q, and offset>` (1 redirects); popular: `https://shiraixis.space/.../leitor.php <redacted query values: id_cap>` to `https://shiraixis.space/.../leitor <redacted query values: id_cap>` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
