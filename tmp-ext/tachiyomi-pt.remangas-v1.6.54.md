# Extension Validation Report

- Extension: tachiyomi-pt.remangas-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7462657023971681136
- Source name: NoxManga
- Source language: pt-BR
- Selected manga input: popular offset 0: IA - O CEO Que Só Quer Uma Vida Tranquila IA (`.../ia-o-ceo-que-so-quer-uma-vida-tranquila-ia`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | IA - O CEO Que Só Quer Uma Vida Tranquila IA (`.../ia-o-ceo-que-so-quer-uma-vida-tranquila-ia`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Desejos Bestiais (`.../desejos-bestiais`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | IA - O CEO Que Só Quer Uma Vida Tranquila IA (`.../ia-o-ceo-que-so-quer-uma-vida-tranquila-ia`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Desejos Bestiais (`.../desejos-bestiais`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 4 | O Antigo Aventureiro do Ranque S Quer Viver uma Vida Tranquila no Campo (`.../o-antigo-aventureiro-do-ranque-s-quer-viver-uma-vida-tranquila-no-campo`) |  | 10s+ |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | IA - O CEO Que Só Quer Uma Vida Tranquila IA (`.../ia-o-ceo-que-so-quer-uma-vida-tranquila-ia`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 40 | Capítulo 1 (`.../e5e9d9a5-e052-4271-97a4-7c0542a0b4fc`) |  | 10s+ |
| pages | `getPageList(chapter)` | success | 20 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 1: title=IA - O CEO Que Só Quer Uma Vida Tranquila IA, URL=`.../ia-o-ceo-que-so-quer-uma-vida-tranquila-ia` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://picture.mangalivre.org/.../1784384055106090957_19943.jpg` (image/webp (encoding: lossy), 60230 bytes, 480x623; server Content-Type: image/jpeg) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ia-o-ceo-que-so-quer-uma-vida-tranquila-ia` |  |  |  |
| details thumbnail URL | PASS | `https://picture.mangalivre.org/.../1784384055106090957_19943.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Drama, Fantasia |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Hyun Sangyoon, herdeiro de terceira geração de um *chaebol*, sonha em levar uma vida despreocupada e sem emprego, aproveitando a renda dos aluguéis de seus prédios em Gangnam. Para tornar esse sonho realidade, ele precisa, antes de tudo, não chamar a atenção do presidente da empresa. Ele planeja causar alguns problemas controláveis ​​para acabar sendo demitido. Mas por que tudo o que ele faz — em suas tentativas de estragar as coisas — acaba dando certo? O objetivo: ser um ocioso de sucesso.<br><br>Títulos alternativos: The Chairman Who Wants to Slack Off and Enjoy Life |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 40 chapters |  |  |  |
| chapter dates | PASS | 40 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://noxmangas.org/.../001.webp <redacted query values: t>` (image/webp (encoding: lossy), 628784 bytes, 800x10180; server Content-Type: image/jpeg) |  |  |  |
